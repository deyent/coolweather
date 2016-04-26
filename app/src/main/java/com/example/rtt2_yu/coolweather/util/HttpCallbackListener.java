package com.example.rtt2_yu.coolweather.util;

/**
 * Created by Rtt2-Yu on 2016/4/19.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
