package com.example.alexeidudarev.unittest.localTests;

import com.example.alexeidudarev.unittest.SimpleMath;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleMathTest {
    public static SimpleMath sm;
    @BeforeClass
    public static void setup(){
        sm = new SimpleMath();
        System.out.println("ready for testing......");
    }
    @AfterClass
    public static void clean(){
        System.out.println("done with testing");
    }

    @Test
    public void add() {
        assertEquals("simple math not added properly ",
                4,sm.add(2,2));
    }

    @Test
    public void sub() {
        assertEquals("simple math not subtracted properly ",
                2,sm.sub(4,2));
    }
    @Ignore
    @Test
    public void positiveDividingTest() {
        double actual = sm.div(9,3);
        assertEquals("simple math not dividing corectly ",
                3.0,actual,0.0);
    }
    @Test
    public void dividingByZeroTest() {
        double actual = sm.div(9,0);
        assertEquals("simple math not dividing properly ",
                0.0,actual,0.0);
    }
    @Test(expected = java.lang.ArithmeticException.class)
    public void dividingByZeroTExeptionTest() {
        double actual = sm.div2(9,0);
        assertEquals("simple math not dividing properly ",
                0.0,actual,0.0);
    }
}