package com.codepath.android_fundamentals.Models;

import com.codepath.android_fundamentals.Activities.BasicTextViewActivity;
import com.codepath.android_fundamentals.Activities.BasicViewsActivity;
import com.codepath.android_fundamentals.Activities.LayoutGravityActivity;
import com.codepath.android_fundamentals.Activities.ViewAttributesActivity;

import java.util.ArrayList;

/**
 * Created by JaneChung on 5/16/17.
 */

public class Topic {
    public String mTitle;
    public Class mClass;

    public Topic(String title, Class clazz) {
        this.mTitle = title;
        this.mClass = clazz;
    }

    //Normally data is fetched from the server or from the user input
    public static ArrayList<Topic> getTopics() {
        ArrayList<Topic> topics = new ArrayList<Topic>();
        topics.add(new Topic("Text View", BasicTextViewActivity.class));
        topics.add(new Topic("Layout Gravity", LayoutGravityActivity.class));
        topics.add(new Topic("Basic Views", BasicViewsActivity.class));
        topics.add(new Topic("View Attributes", ViewAttributesActivity.class));
        return topics;
    }
}
