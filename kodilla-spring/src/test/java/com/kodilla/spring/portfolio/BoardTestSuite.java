package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //Given
        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        //When
        toDoList.addTask("ToDo task1");
        inProgressList.addTask("InProgress task2");
        doneList.addTask("Done task3");

        //Then
        System.out.println("To Do List tasks:");
        toDoList.getTasks().forEach(System.out::println);
        System.out.println("\nIn Progress List tasks:");
        inProgressList.getTasks().forEach(System.out::println);
        System.out.println("\nDone List tasks:");
        doneList.getTasks().forEach(System.out::println);
    }
}
