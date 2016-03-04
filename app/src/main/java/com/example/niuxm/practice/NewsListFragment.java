package com.example.niuxm.practice;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.niuxm.practice.api.Uri;
import com.example.niuxm.practice.baisc.BaseFragment;
import com.example.niuxm.practice.model.Newsbean;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.orhanobut.logger.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by niuxm on 2016/3/1.
 */
public class NewsListFragment extends BaseFragment
        implements SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private int mType;
    private OkHttpClient mOkHttpClient;
    private List<Newsbean> mNewsbeans;
    private List<Newsbean> mNewsbeans1 = new ArrayList<Newsbean>();
    private NewsAdapter mNewsAdapter;
    private Handler mHandler;
    private LinearLayoutManager mLinearLayoutManager;


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

        mOkHttpClient = new OkHttpClient();

    }

    private void requestData(String url) throws Exception {
        Request request = new Request.Builder().url(url).build();

        //Response response = mOkHttpClient.newCall(request).execute();

        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override public void onFailure(Call call, IOException e) {

            }
            @Override public void onResponse(Call call, Response response)
                    throws IOException {
                String string = response.body().string();
                Gson gson = new Gson();
                mNewsbeans = new ArrayList<Newsbean>();
                JsonParser jsonParser = new JsonParser();
                JsonObject jsonObject = jsonParser.parse(string)
                                                  .getAsJsonObject();
                JsonElement jsonElement = jsonObject.get("T1348647909107");
                if (jsonElement == null) {
                    return;
                }
                JsonArray jsonArray = jsonElement.getAsJsonArray();
                for (int i = 0; i < jsonArray.size(); i++) {
                    JsonObject jsonObject1 = jsonArray.get(i).getAsJsonObject();
                    if (!jsonObject1.has("imgextra")) {
                        Newsbean newsbean = gson.fromJson(jsonObject1,
                                Newsbean.class);
                        Logger.i(newsbean.getTitle() + "-----" +
                                newsbean.getDigest());
                        mNewsbeans.add(newsbean);
                    }
                }
                mHandler = new Handler(Looper.getMainLooper());
                mHandler.post(new Runnable() {
                    @Override public void run() {
                        Logger.i(mNewsbeans.get(1).getTitle());
                        if (mNewsAdapter == null) {
                        mNewsAdapter = new NewsAdapter(getActivity().getApplicationContext());
                        mRecyclerView.setAdapter(mNewsAdapter);
                        }
                        mNewsbeans1.addAll(mNewsbeans);
                        mNewsAdapter.setData(mNewsbeans1);
                        //mNewsAdapter.notifyDataSetChanged();
                    }
                });
            }

        });
        //if (response.isSuccessful()) {
        //    Logger.d(response.body().string());
        //}

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        try {
            requestData(Uri.NEWS_URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
                R.color.colorPrimaryDark, R.color.colorAccent,
                R.color.colorPrimary, R.color.colorAccent);
        mSwipeRefreshLayout.setOnRefreshListener(this);

        mRecyclerView.setHasFixedSize(true);
        mLinearLayoutManager = new LinearLayoutManager(
                container.getContext());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        //mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mRecyclerView.addOnScrollListener(mOnScrollListener);
        return view;
    }


    private RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() {

        private int lastVisibleItem;
        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);

            if (newState == RecyclerView.SCROLL_STATE_IDLE &&
                    lastVisibleItem + 1 == mNewsAdapter.getItemCount() &&
                    mNewsAdapter.isShowFooter()) {
                try {
                    requestData(Uri.NEWS_URL2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            lastVisibleItem = mLinearLayoutManager
                    .findLastVisibleItemPosition();

        }
    };

    @Override public void onRefresh() {
        mNewsbeans.clear();
        try {
            requestData(Uri.NEWS_URL1);
            mSwipeRefreshLayout.setRefreshing(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
