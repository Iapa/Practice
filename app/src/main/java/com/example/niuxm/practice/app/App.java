package com.example.niuxm.practice.app;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatDelegate;
import com.orhanobut.logger.Logger;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by niuxm on 2016/3/2.
 */
public class App extends Application {
    static {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
    }
    private RefWatcher mRefWatcher;
    
    public static RefWatcher getRefWatcher(Context context) {
        App app = (App) context.getApplicationContext();
        return app.mRefWatcher;
        }


    @Override public void onCreate() {
        super.onCreate();
        Logger.init();
        mRefWatcher = LeakCanary.install(this);
    }
}


