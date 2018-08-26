package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When
        Calculator calculator = context.getBean(Calculator.class);
        //Then
        Assert.assertEquals(12, calculator.add(10, 2), 0.001);
        Assert.assertEquals(8, calculator.sub(10, 2), 0.001);
        Assert.assertEquals(20, calculator.mul(10, 2), 0.001);
        Assert.assertEquals(5, calculator.div(10, 2), 0.001);
    }
}
