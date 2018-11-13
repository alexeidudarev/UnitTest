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
 *
 * * should include next config
 * * testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
 * *
 * * should also include next depenency
 * * androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
 *
 *
 * can be used for black box testing with viewer
 */


import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.alexeidudarev.unittest.MainActivity;
import com.example.alexeidudarev.unittest.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.hasFocus;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class MainActivityTestEspresso {

    //before run any instrumental test- emulator or device should be connected
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new
            ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void testEspessoAPI() throws InterruptedException {
        ViewInteraction interaction = onView(allOf(withId(R.id.helloTV)
                ,withText("Hello World!"),hasFocus()));
        Thread.sleep(3000);
        interaction.perform(ViewActions.replaceText("some new text"));
        ViewInteraction interaction2 = onView(allOf(withId(R.id.helloTV)
                ,withText("some new text")));
        Thread.sleep(3000);
        interaction2.check(ViewAssertions.matches(hasFocus()));
    }
    @Test
    public void testEspessoAPIStaticImport() throws InterruptedException {
        onView(allOf(withId(R.id.helloTV), withText("Hello World!"),hasFocus()))
                .perform(ViewActions.replaceText("some new text"));
        Thread.sleep(3000);
        onView(allOf(withId(R.id.helloTV)
                ,withText("some new text")))
                .check(ViewAssertions.matches(hasFocus()));
        Thread.sleep(3000);
    }
}

