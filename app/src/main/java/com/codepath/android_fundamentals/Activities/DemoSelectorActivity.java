package com.codepath.android_fundamentals.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.codepath.android_fundamentals.Adapters.DemoSelectorAdapter;
import com.codepath.android_fundamentals.Models.Topic;
import com.codepath.android_fundamentals.R;

import java.util.ArrayList;

public class DemoSelectorActivity extends AppCompatActivity {

    ArrayList<Topic> mTopics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_selector);

        // Lookup the recyclerview
        RecyclerView rvTopics = (RecyclerView) findViewById(R.id.rvTopics);

        // Initialize topics
        mTopics = Topic.getTopics();
        // Create adapter
        DemoSelectorAdapter adapter = new DemoSelectorAdapter(this, mTopics);
        // Attach the adapter to the recyclerview
        rvTopics.setAdapter(adapter);
        // Set layout manager to position the items;
        rvTopics.setLayoutManager(new LinearLayoutManager(this));
    }
}
