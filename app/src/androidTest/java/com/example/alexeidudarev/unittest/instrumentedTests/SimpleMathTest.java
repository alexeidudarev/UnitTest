/**
 * to run this test next dependencies should be added to gradle
 *
 * androidTestImplementation 'com.android.support.test:runner:1.0.2'
 * androidTestImplementation 'com.android.support:support-annotations:28.0.0'
 *
 * also AVD should be launched before this testing
 */


package com.example.alexeidudarev.unittest.instrumentedTests;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class SimpleMathTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void diff_isCorrect() {
        assertEquals(2, 4 - 2);
    }
}
