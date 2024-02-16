import dayjs from 'dayjs/esm';

import { IPost, NewPost } from './post.model';

export const sampleWithRequiredData: IPost = {
  id: '689d80fa-f465-4a20-8518-cc574061985d',
  title: 'guide tard malade',
  content: '../fake-data/blob/hipster.txt',
  date: dayjs('2024-02-15T20:24'),
};

export const sampleWithPartialData: IPost = {
  id: '1b71c4d0-45a9-44e5-8c6d-5f98320cc7fb',
  title: 'dès tantôt',
  content: '../fake-data/blob/hipster.txt',
  date: dayjs('2024-02-16T03:44'),
};

export const sampleWithFullData: IPost = {
  id: '9b51c801-6164-4faa-b6df-4d8c95041bb1',
  title: 'géométrique',
  content: '../fake-data/blob/hipster.txt',
  date: dayjs('2024-02-15T22:36'),
};

export const sampleWithNewData: NewPost = {
  title: 'exposer maigre adorable',
  content: '../fake-data/blob/hipster.txt',
  date: dayjs('2024-02-16T03:45'),
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
