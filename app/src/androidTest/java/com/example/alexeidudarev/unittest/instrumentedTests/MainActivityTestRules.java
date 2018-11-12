package com.example.alexeidudarev.unittest.instrumentedTests;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

public class MainActivityTestRules<A extends Activity> extends ActivityTestRule<A> {

    public MainActivityTestRules(Class<A> activityClass){
        super(activityClass);
    }

    @Override
    protected Intent getActivityIntent() {
        Log.e("Main activityTestRules","prepare activit's intents");
        return super.getActivityIntent();
    }

    @Override
    protected void beforeActivityLaunched() {
        Log.e("Main activityTestRules","prepare activit's intents");
        super.beforeActivityLaunched();
    }

    @Override
    protected void afterActivityLaunched() {
        super.afterActivityLaunched();
    }

    @Override
    protected void afterActivityFinished() {
        super.afterActivityFinished();
    }

    @Override
    public A launchActivity(@Nullable Intent startIntent) {
        return super.launchActivity(startIntent);
    }
}
