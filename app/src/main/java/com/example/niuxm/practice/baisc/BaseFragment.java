package com.example.niuxm.practice.baisc;

import android.support.v4.app.Fragment;
import com.example.niuxm.practice.app.App;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by niuxm on 2016/3/2.
 */
public class BaseFragment extends Fragment {

    @Override public void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = App.getRefWatcher(getActivity());
        refWatcher.watch(this);
    }
}


