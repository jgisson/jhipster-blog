import { IBlog, NewBlog } from './blog.model';

export const sampleWithRequiredData: IBlog = {
  id: '3968187e-ff76-4924-94fb-2abe60fb9f1c',
  name: 'premièrement concernant',
  handle: 'oups diminuer renverser',
};

export const sampleWithPartialData: IBlog = {
  id: 'b9c2533e-aedf-48a8-bb4a-815f74a41bb6',
  name: 'parce que solitaire',
  handle: 'loin hors de',
};

export const sampleWithFullData: IBlog = {
  id: '7255ced4-ad6f-4c40-b8d9-fb0c81d28add',
  name: 'rectorat détruire',
  handle: 'rapide rose tsoin-tsoin',
};

export const sampleWithNewData: NewBlog = {
  name: 'étant donné que',
  handle: 'jusqu’à ce que comme',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
