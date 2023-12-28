package br.labs.screen;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import android.media.AudioManager;
import android.content.Context;
import android.content.Intent;

import android.content.IntentFilter;
import android.content.BroadcastReceiver;

@CapacitorPlugin(name = "ScreenOnOffDetect")
public class ScreenOnOffDetectPlugin extends Plugin {

    public void sendEvent(String value){
        JSObject ret = new JSObject();
        ret.put("value", value);
        notifyListeners("screenOnOff", ret);
    }

    @Override
    public void load() {
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        BroadcastReceiver mReceiver = new ScreenReceiver(this);
        getContext().registerReceiver(mReceiver, filter);
    }

}
