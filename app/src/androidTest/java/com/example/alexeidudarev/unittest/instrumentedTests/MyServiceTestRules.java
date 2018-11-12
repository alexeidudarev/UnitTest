package com.example.alexeidudarev.unittest.instrumentedTests;

import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.test.rule.ServiceTestRule;
import android.util.Log;

import java.util.concurrent.TimeoutException;

public class MyServiceTestRules extends ServiceTestRule {

    @Override
    public void startService(@NonNull Intent intent) throws TimeoutException {
        Log.e("My service test rule","start service");
        super.startService(intent);
    }

    @Override
    public IBinder bindService(@NonNull Intent intent) throws TimeoutException {
        Log.e("My service test rule","bind service");
        return super.bindService(intent);
    }

    @Override
    protected void beforeService() {
        Log.e("My service test rule","work before servise start");
        super.beforeService();
    }

    @Override
    protected void afterService() {
        Log.e("My service test rule","work after servise start");
        super.afterService();
    }
}
