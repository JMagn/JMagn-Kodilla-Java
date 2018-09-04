package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
}