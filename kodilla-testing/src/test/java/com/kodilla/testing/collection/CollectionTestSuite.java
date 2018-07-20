package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
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

    private static List<Integer> initEmptyList() {
        List<Integer> emptyList = new ArrayList<Integer>();

        return emptyList;
    }

    private static List<Integer> initNumbers() {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);

        return numbers;
    }

    private static List<Integer> initTestEmptyList() {
        List<Integer> testEmptyList = new ArrayList<Integer>();

        return testEmptyList;
    }

    private static List<Integer> initTestNumbers() {
        List<Integer> testNumbers = new ArrayList<Integer>();

        testNumbers.add(2);

        return testNumbers;
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(initEmptyList());
        // When
        List<Integer> result = oddNumbersExterminator.getList();
        System.out.println("Testing empty list");
        // Then
        Assert.assertEquals(initTestEmptyList(), result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(initNumbers());
        // When
        List<Integer> result = oddNumbersExterminator.getList();
        System.out.println("Testing normal list");
        // Then
        Assert.assertEquals(initTestNumbers(), result);
    }
}