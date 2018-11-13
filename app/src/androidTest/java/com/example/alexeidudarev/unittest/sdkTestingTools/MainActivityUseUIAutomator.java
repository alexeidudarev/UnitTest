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
}

