package com.example.niuxm.practice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.niuxm.practice.model.Newsbean;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by niuxm on 2016/3/1.
 */
public class NewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int TYPE_ITEM = 0;
    public static final int TYPE_FOOTER = 1;

    private boolean isShowFooter = true;
    private Context mContext;
    private final LayoutInflater mInflator;
    private List<Newsbean> mNewsbeans;

    public NewsAdapter(Context  context) {
        this.mContext = context;
        mInflator = LayoutInflater.from(context);
        mNewsbeans = new ArrayList<Newsbean>();

    }

    public void setData(List<Newsbean> newsbeans) {
        mNewsbeans = newsbeans;
        notifyDataSetChanged();
    }


    @Override public int getItemViewType(int position) {
        if (!isShowFooter) {
            return TYPE_ITEM;
        }
        if (position + 1 == getItemCount()) {
            return TYPE_FOOTER;
        }
        else {
            return TYPE_ITEM;
        }
    }

    public boolean isShowFooter() {
        return isShowFooter;
    }

    public void addData(List<Newsbean> newsbeans) {
        if(newsbeans == null) throw new NullPointerException("sdfds");
        mNewsbeans.addAll(newsbeans);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == TYPE_ITEM) {
            View view = mInflator.inflate(R.layout.item_newslist, parent,
                    false);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        }
        else {
            View view = mInflator.inflate(R.layout.footer, null);
            view.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            return new FooterViewHolder(view);
        }
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {
            if (mNewsbeans != null) {
                Newsbean news = mNewsbeans.get(position);
                if (news == null) {
                    return;
                }
                ((ViewHolder) holder).mTitle.setText(news.getTitle());
                ((ViewHolder) holder).mDesc.setText(news.getDigest());
                Picasso.with(mContext).load(news.getImgsrc()).into(((ViewHolder) holder).mImageView);

            }
        }
    }




    @Override public int getItemCount() {
        return mNewsbeans==null?20:mNewsbeans.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        public ImageView mImageView;
        public TextView mTitle;
        public TextView mDesc;


        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.iv_item);
            mTitle = (TextView) itemView.findViewById(R.id.tv_item_title);
            mDesc = (TextView) itemView.findViewById(R.id.tv_item_desc);
            itemView.setOnClickListener(this);
        }


        @Override public void onClick(View v) {

        }
    }

    private class FooterViewHolder extends RecyclerView.ViewHolder {
        public FooterViewHolder(View itemView) {
            super(itemView);
        }
    }
}
