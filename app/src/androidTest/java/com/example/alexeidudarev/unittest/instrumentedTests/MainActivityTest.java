package com.example.alexeidudarev.unittest.instrumentedTests;


import android.app.Activity;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import com.example.alexeidudarev.unittest.MainActivity;
import com.example.alexeidudarev.unittest.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public MainActivityTestRules<MainActivity>mainActivityActivityTestRules = new
            MainActivityTestRules<MainActivity>(MainActivity.class);
    @Test
    public void testUI(){
        Activity activity = mainActivityActivityTestRules.getActivity();
        assertNotNull(activity.findViewById(R.id.helloTV));
        TextView tv = (TextView)activity.findViewById(R.id.helloTV);
        assertTrue(tv.isShown());
        //assertEquals("Hello world",tv.getText());
        //same exaple using string annotation
        assertEquals(InstrumentationRegistry
                .getTargetContext()
                .getString(R.string.hello_world),tv.getText());
    }


}

