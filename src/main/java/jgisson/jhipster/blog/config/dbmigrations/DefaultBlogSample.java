package jgisson.jhipster.blog.config.dbmigrations;

import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import java.time.Instant;
import jgisson.jhipster.blog.domain.Blog;
import jgisson.jhipster.blog.domain.Post;
import jgisson.jhipster.blog.domain.Tag;
import jgisson.jhipster.blog.domain.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@ChangeUnit(id = "DefaultBlogSampleId", order = "002", author = "jgisson")
public class DefaultBlogSample {

    private final MongoTemplate template;

    public DefaultBlogSample(MongoTemplate template) {
        this.template = template;
    }

    @Execution
    public void changeSet() {
        Query adminQuery = new Query().addCriteria(Criteria.where("login").is("admin"));
        User admin = template.findOne(adminQuery, User.class);

        Tag demoTag = new Tag().name("demo");
        template.save(demoTag);

        Blog blog = new Blog().name("Default Blog").handle("Sample Blog with many Post").user(admin);
        blog = template.save(blog);

        Post post01 = new Post()
            .blog(blog)
            .title("Post Demo 01")
            .date(Instant.now())
            .addTag(demoTag)
            .content(
                """
                  Consequat eu cillum nostrud non esse magna incididunt elit adipiscing quis adipiscing et cupidatat tempor
                  lorem excepteur. Reprehenderit minim eiusmod culpa consectetur voluptate amet sint do laborum sit ea amet aute
                  eiusmod lorem sint esse ex nisi.
                """
            );
        template.save(post01);

        Post post02 = new Post()
            .blog(blog)
            .title("Post Demo 02")
            .date(Instant.now())
            .addTag(demoTag)
            .content(
                """
                  Esse laborum esse commodo anim quis consectetur incididunt anim proident laboris esse proident occaecat.
                   Sit commodo deserunt officia excepteur laboris fugiat ipsum duis in labore cillum fugiat elit magna ea
                   sint ullamco cupidatat. Mollit aute proident non qui pariatur esse nulla quis anim consequat velit et
                   officia laborum eu adipiscing amet officia dolor. Pariatur cupidatat aute proident laborum tempor sed
                   laboris et reprehenderit est elit ipsum dolor esse velit. Ea culpa voluptate occaecat aute quis ea
                   mollit adipiscing officia lorem incididunt nulla magna culpa proident ea mollit enim.
                   Exercitation sed ipsum aliquip labore tempor est ullamco velit excepteur et ipsum excepteur.

                  Aliquip ut amet mollit veniam fugiat voluptate pariatur deserunt amet. Tempor incididunt commodo aute
                   aliqua nulla sunt adipiscing voluptate enim amet veniam lorem consequat deserunt. Ex lorem laboris in
                   velit sit laborum esse et laborum enim proident est. Aliqua velit dolor magna eu in officia voluptate
                   nulla occaecat cillum irure commodo veniam. Ullamco velit est ad eiusmod mollit incididunt nulla
                   ut nulla. Consequat culpa sit aute laboris ipsum cillum veniam sit sunt aliquip non deserunt consequat
                   magna cupidatat.
                """
            );
        template.save(post02);
    }

    @RollbackExecution
    public void rollback() {}
}
