package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Submodule 13", "Learning Hibernate");
        taskListDao.save(taskList);
        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(taskList.getListName());
        //Then
        Assert.assertEquals("Submodule 13", readTaskLists.get(0).getListName());
        Assert.assertEquals(1, readTaskLists.size());
        //CleanUp
        taskListDao.delete(taskList);
    }
}
