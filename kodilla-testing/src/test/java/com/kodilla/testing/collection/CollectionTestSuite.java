package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    private List<Integer> initEmptyList() {
        return new ArrayList<Integer>();
    }

    private List<Integer> initNumbers() {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);

        return numbers;
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        // When
        List<Integer> result = oddNumbersExterminator.exterminate(initEmptyList());
        System.out.println("Testing empty list");
        // Then
        Assert.assertEquals(initEmptyList(), result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        // When
        List<Integer> result = oddNumbersExterminator.exterminate(initNumbers());
        System.out.println("Testing normal list");
        // Then
        Assert.assertEquals(Arrays.asList(2), result);
    }
}