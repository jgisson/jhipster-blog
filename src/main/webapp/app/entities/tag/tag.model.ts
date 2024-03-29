import { IPost } from 'app/entities/post/post.model';

export interface ITag {
  id: string;
  name?: string | null;
  posts?: IPost[] | null;
}

export type NewTag = Omit<ITag, 'id'> & { id: null };
