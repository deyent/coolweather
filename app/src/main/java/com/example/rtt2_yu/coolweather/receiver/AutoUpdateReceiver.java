package com.example.rtt2_yu.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.rtt2_yu.coolweather.service.AutoUpadateService;

/**
 * Created by Rtt2-Yu on 2016/4/26.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        Intent i=new Intent(context, AutoUpadateService.class);
        context.startService(i);
    }
}
