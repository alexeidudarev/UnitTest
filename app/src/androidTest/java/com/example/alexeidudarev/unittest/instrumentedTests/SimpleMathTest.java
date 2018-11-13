/**
 * to run this test next dependencies should be added to gradle
 *
 * androidTestImplementation 'com.android.support.test:runner:1.0.2'
 * androidTestImplementation 'com.android.support:support-annotations:28.0.0'
 *
 * also AVD should be launched before this testing
 */


package com.example.alexeidudarev.unittest.instrumentedTests;
import android.os.Build;
import android.support.test.filters.LargeTest;
import android.support.test.filters.RequiresDevice;
import android.support.test.filters.SdkSuppress;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class SimpleMathTest {

    @Test
    @SdkSuppress(minSdkVersion = 20)
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    @LargeTest
    //use next annotation to test staff like bluetooth
    //that require real device connected
    @RequiresDevice
    public void testBluetooth() {
        //using internet and external devices
    }
    @SdkSuppress(minSdkVersion = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    public void testFingerPrint() {

    }
    //test new future not exist api
    @SdkSuppress(minSdkVersion = 55)
    public void testFingerPrintNew() {

    }
    @SmallTest
    public void testFingerPrintLite() {

    }
}
