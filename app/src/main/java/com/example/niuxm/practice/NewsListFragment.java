package com.example.niuxm.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.niuxm.practice.baisc.BaseFragment;

/**
 * Created by niuxm on 2016/3/1.
 */
public class NewsListFragment extends BaseFragment
        implements SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private int mType;


    public static NewsListFragment newInstance(int type) {
        NewsListFragment newsListFragment = new NewsListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", type);
        newsListFragment.setArguments(bundle);
        return newsListFragment;
    }


    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mType = getArguments().getInt("type");

    }


    @SuppressWarnings("ResourceType") @Nullable @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newslist, container,
                false);
        mRecyclerView = (RecyclerView) view.findViewById(
                R.id.recycler_news);
        mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(
                R.id.swipe_newslist);
        mSwipeRefreshLayout.setColorSchemeColors(R.color.colorPrimary,
                R.color.colorPrimaryDark, R.color.colorAccent,R.color
                        .colorPrimary,R.color.colorAccent);
        mSwipeRefreshLayout.setOnRefreshListener(this);

        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                container.getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        NewsAdapter newsAdapter = new NewsAdapter(container.getContext());
        mRecyclerView.setAdapter(newsAdapter);

        return view;
    }


    @Override public void onRefresh() {

    }
}
