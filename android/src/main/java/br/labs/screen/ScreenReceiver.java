package br.labs.screen;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;

import com.getcapacitor.JSObject;

public class ScreenReceiver extends BroadcastReceiver {
 
    private ScreenOnOffDetectPlugin plugin;

    public ScreenReceiver(ScreenOnOffDetectPlugin plugin){
        this.plugin = plugin;
    }
 
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            this.plugin.sendEvent("screen off");
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            this.plugin.sendEvent("screen on");
        }
    }


 
}