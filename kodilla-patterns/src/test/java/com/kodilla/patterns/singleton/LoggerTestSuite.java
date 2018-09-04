package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void testLog() {
        Logger.getInstance().log("log1234");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        //Then
        Assert.assertEquals("log1234", Logger.getInstance().getLastLog());
    }
}
