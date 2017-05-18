package com.codepath.android_fundamentals.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.codepath.android_fundamentals.R;
import com.codepath.android_fundamentals.Models.Topic;

import java.util.List;

/**
 * Created by JaneChung on 5/16/17.
 */

public class DemoSelectorAdapter extends RecyclerView.Adapter<DemoSelectorAdapter.ViewHolder> {

    List<Topic> mTopics;
    private Context mContext;

    public DemoSelectorAdapter(Context context, List<Topic> topics) {
        mContext = context;
        mTopics = topics;
    }

    private Context getContext() {
        return mContext;
    }

    @Override
    public DemoSelectorAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View topicView = inflater.inflate(R.layout.item_topic, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(topicView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DemoSelectorAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        Topic topic = mTopics.get(position);

        // Set item views based on your views and data model
        TextView textView = holder.tvTitle;
        textView.setText(topic.mTitle);
    }

    @Override
    public int getItemCount() {
        return mTopics.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tvTopicTitle);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            //If the item is not deleted, then take action
            if (position != RecyclerView.NO_POSITION) {
                Topic topic = mTopics.get(position);

                //Set intent to show new Activity
                Intent intent = new Intent(mContext, topic.mClass);
                mContext.startActivity(intent);
            }
        }
    }

}
