package com.example.niuxm.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.niuxm.practice.baisc.BaseFragment;

/**
 * Created by niuxm on 2016/3/1.
 */
public class PictureFragment extends BaseFragment {
    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ImageView imageView = new ImageView(container.getContext());
        imageView.setImageResource(R.mipmap.ic_launcher);
        return imageView;
    }
}
