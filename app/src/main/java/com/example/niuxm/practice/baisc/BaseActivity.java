package com.example.niuxm.practice.baisc;

import android.support.v7.app.AppCompatActivity;
import com.example.niuxm.practice.app.App;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by niuxm on 2016/3/2.
 */
public class BaseActivity extends AppCompatActivity {

    @Override protected void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = App.getRefWatcher(this);
        refWatcher.watch(this);
    }
}


