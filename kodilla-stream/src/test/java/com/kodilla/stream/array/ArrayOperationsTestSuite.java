package com.kodilla.stream.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Before
    public void before() {
        System.out.println("Test case begins");
    }

    @After
    public void after() {
        System.out.println("Test case ends");
    }

    @Test
    public void testGetAverage() {
        // Given
        int[] numbers = new int[] {8,41,12,1,19,6,100,8,39,10,11,66,6,2,1,16,17,20,1,20};
        // When
        double average = ArrayOperations.getAverage(numbers);
        // Then
        Assert.assertEquals(20.2, average, 0.001);
    }
}