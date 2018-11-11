package com.example.alexeidudarev.unittest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class HamcrestTests {
    @Test
    public void withoutHamcrest(){
        List<String>list = someList();
        assertTrue(list.contains("dog"));
        assertTrue(list.contains("fox"));
        assertTrue(list.size() > 3);
        assertTrue(list.size() < 12);
    }
    @Test
    public void withoutHamcrestBigAssets(){
        List<String>list = someList();
        assertTrue(list.contains("dog") && list.contains("fox")
        && list.size() > 3 && list.size() < 12);

    }
    @Test
    public void withHamcres(){
        List<String>list= someList();
        assertThat(list,(hasItems("dog","fox")));
        assertThat(list,allOf(hasSize(lessThan(12)),hasSize(greaterThan(3))));

    }

    private List<String>someList(){
        String[]sentece = {"dog","fox","rabbit","wolf"};
        return Arrays.asList(sentece);
    }
}
