import { registerPlugin } from '@capacitor/core';

import type { ScreenOnOffDetectPlugin } from './definitions';

const ScreenOnOffDetect = registerPlugin<ScreenOnOffDetectPlugin>('ScreenOnOffDetect', {
  web: () => import('./web').then(m => new m.ScreenOnOffDetectWeb()),
});

export * from './definitions';
export { ScreenOnOffDetect };
