package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addToDoTask("Do laundry");
        board.addInProgressTask("Learn Java");
        board.addDoneTask("Wash dishes");

        //When
        List<String> toDoList = board.getToDoList().getTasks();
        List<String> inProgressList = board.getInProgressList().getTasks();
        List<String> doneList = board.getDoneList().getTasks();

        //Then
        Assert.assertEquals("Do laundry", toDoList.get(0));
        Assert.assertEquals("Learn Java", inProgressList.get(0));
        Assert.assertEquals("Wash dishes", doneList.get(0));
        Assert.assertEquals(1, toDoList.size());
        Assert.assertEquals(1, inProgressList.size());
        Assert.assertEquals(1, doneList.size());
    }
}
