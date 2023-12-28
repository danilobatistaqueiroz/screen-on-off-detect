import { WebPlugin } from '@capacitor/core';

import type { ScreenOnOffDetectPlugin } from './definitions';

export class ScreenOnOffDetectWeb extends WebPlugin implements ScreenOnOffDetectPlugin {
  async onOff(): Promise<{value:string}> {
    return new Promise((resolve) => {
      resolve({value:""});
    });
  }
}
