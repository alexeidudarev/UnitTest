package com.example.alexeidudarev.unittest.sdkTestingTools;


/**
 *in terminal navigate to sdk location
 *then to tools folder
 *run uiautomatorviewer.bat
 * with viewer we can inspect any element in layout of device
 * even from any app
 *
 * should use next import
 * to dependencies gradle list
 * androidTestImplementation 'com.android.support.test.uiautomator:uiautomator-v18:2.1.3'
 *
 * can be used for black box testing with viewer
 */


import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import com.example.alexeidudarev.unittest.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityUseUIAutomator {


    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new
            ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void testPressBackButton(){
        //device.pressBack();
    }
    @Test
    public void testOfScreenEnabled() throws RemoteException {
        UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        if(device.isScreenOn()){
            device.setOrientationLeft();
            device.openNotification();
        }
    }
    @Test
    public void testSelectElement() throws UiObjectNotFoundException {
        UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiSelector selector = new UiSelector();
        UiObject aWidget;
        selector.className("android.widgets.TextView");
        selector.focused(false);
        selector.selected(false);
        selector.text("Display");
        aWidget = device.findObject(selector);
        aWidget.click();
    }
    @Test
    public void testUIAutomatorAPI() throws InterruptedException,UiObjectNotFoundException {
        UiDevice dev = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiSelector etSelector = new UiSelector();
        etSelector.text("Hello World!")
                .className("android.widget.EditText")
                .focusable(true);
        UiObject editTextWidget  = dev.findObject(etSelector);
        editTextWidget.setText("this is a new Test");

        Thread.sleep(2000);

        UiSelector btnselector = new UiSelector().text("SET")
                .className("android.widget.Button")
                .clickable(true);
        UiObject buttonaWidget = dev.findObject(btnselector);
        if(btnselector!=null){
            buttonaWidget.click();
        }


        Thread.sleep(2000);

    }

}

