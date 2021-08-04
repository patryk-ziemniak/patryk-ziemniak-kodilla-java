package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String taskListName = "Test: Task List Name";
    private static final String taskListDescription = "Task Description";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(taskListName, taskListDescription);
        taskListDao.save(taskList);

        //When
        List<TaskList> searchResult = taskListDao.findByListName(taskListName);

        //Then
        assertEquals(1, searchResult.size());
        assertEquals(taskListName, searchResult.get(0).getListName());

        //CleanUp
        taskListDao.delete(taskList);
    }
}
