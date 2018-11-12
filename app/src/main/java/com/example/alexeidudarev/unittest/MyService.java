package com.example.alexeidudarev.unittest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.e("My service","binding My service");
        return new LocalBinder();
    }

    @Override
    public void onCreate() {
        Log.e("My service","creating My service");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("My service","executing some work");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.e("My service","destroying My service");
        super.onDestroy();
    }

    public class LocalBinder extends Binder {
        public MyService getMyservice(){
            return MyService.this;
        }
    }
}
