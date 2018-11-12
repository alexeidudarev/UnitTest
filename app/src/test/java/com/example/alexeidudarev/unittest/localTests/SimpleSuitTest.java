package com.example.alexeidudarev.unittest.localTests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({HamcrestTests.class,ExampleUnitTest.class})
//@Categories.IncludeCategory(Some.class)
//@Categories.ExcludeCategory(Another.class)
public class SimpleSuitTest {
}
