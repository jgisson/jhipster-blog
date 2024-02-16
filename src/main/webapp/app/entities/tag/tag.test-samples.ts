import { ITag, NewTag } from './tag.model';

export const sampleWithRequiredData: ITag = {
  id: '839cf64b-62dd-4dec-a223-c1fe1e9f18f0',
  name: 'malade extra',
};

export const sampleWithPartialData: ITag = {
  id: '01dac470-d0eb-4d4c-b6fb-d13ac70f23d8',
  name: 'gai',
};

export const sampleWithFullData: ITag = {
  id: 'fdbe79f5-3f17-4f83-b30c-106e270802e2',
  name: 'volontiers accompagner',
};

export const sampleWithNewData: NewTag = {
  name: 'dessus étranger',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
