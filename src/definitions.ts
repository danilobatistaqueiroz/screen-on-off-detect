import type { PluginListenerHandle } from '@capacitor/core';

export interface ScreenOnOffState {
  value: string;
}

export interface ScreenOnOffDetectPlugin {
  
  addListener(
    eventName: 'screenOnOff',
    listener: OnOffListener,
  ): Promise<PluginListenerHandle>;
}

export type OnOffListener = (state: ScreenOnOffState) => void;
