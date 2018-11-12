package com.example.alexeidudarev.unittest.instrumentedTests;

import android.content.Intent;
import android.os.IBinder;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ServiceTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.alexeidudarev.unittest.MyService;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeoutException;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class MyServiceTest {
    @Rule
    public ServiceTestRule serviceTestRule = new ServiceTestRule();
    @Test
    public void testService()throws TimeoutException {
        serviceTestRule.startService(new Intent(InstrumentationRegistry.getContext(),
                MyService.class));
    }
    @Test
    public void testBoundsService() throws TimeoutException{
        IBinder binder = serviceTestRule.bindService(new
                Intent(InstrumentationRegistry.getTargetContext(),MyService.class));
        MyService service = ((MyService.LocalBinder) binder).getMyservice();
        assertNotNull("Bound service is null",service);
    }
}

