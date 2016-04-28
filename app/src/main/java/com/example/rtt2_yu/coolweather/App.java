package com.example.rtt2_yu.coolweather;

// 
// .__   __.   ______      .______    __    __    _______ 
// |  \ |  |  /  __  \     |   _  \  |  |  |  |  /  _____|
// |   \|  | |  |  |  |    |  |_)  | |  |  |  | |  |  __  
// |  . `  | |  |  |  |    |   _  <  |  |  |  | |  | |_ | 
// |  |\   | |  `--'  |    |  |_)  | |  `--'  | |  |__| | 
// |__| \__|  \______/     |______/   \______/   \______| 
// 
// 

import android.app.Application;
import android.os.StrictMode;

/**
 * x created on 16/4/28
 */

public class App extends Application {
    @Override
    public void onCreate() {

        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyDeath()
                .build());

        super.onCreate();
    }
}
