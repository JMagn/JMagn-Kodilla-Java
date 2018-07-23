package com.kodilla.testing.collection;

import org.junit.*;
import java.util.Arrays;
import java.util.Collections;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        Assert.assertEquals(Collections.emptyList(), OddNumbersExterminator.exterminate(Collections.emptyList()));
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        Assert.assertEquals(Arrays.asList(2), OddNumbersExterminator.exterminate(Arrays.asList(1, 2)));
    }
}