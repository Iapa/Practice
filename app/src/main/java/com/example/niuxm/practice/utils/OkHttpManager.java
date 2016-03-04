package com.example.niuxm.practice.utils;

import android.os.Handler;
import android.os.Looper;
import okhttp3.OkHttpClient;

/**
 * Created by niuxm on 2016/3/4.
 */
public class OkHttpManager {

    private static OkHttpManager mOkHttpManager;
    private  OkHttpClient mOkHttpClient;
    private Handler mHandler;

    private OkHttpManager() {
        mOkHttpClient = new OkHttpClient();
        mHandler = new Handler(Looper.getMainLooper());
    }
    public static OkHttpManager getInstance() {
        if (mOkHttpManager == null) {
            synchronized (OkHttpManager.class) {
                if (mOkHttpManager == null) {
                    mOkHttpManager = new OkHttpManager();
                }
            }
        }
        return mOkHttpManager;
    }
}
