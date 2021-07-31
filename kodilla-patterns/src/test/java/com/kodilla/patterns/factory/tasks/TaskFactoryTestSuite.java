package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        Task task = TaskFactory.createTask(TaskFactory.SHOPPING);

        //When
        String taskName = task.getTaskName();

        //Then
        assertEquals("Buying potatoes", taskName);
    }

    @Test
    void testFactoryPainting() {
        //Given
        Task task = TaskFactory.createTask(TaskFactory.PAINTING);

        //When
        String taskName = task.getTaskName();

        //Then
        assertEquals("Painting Circle", taskName);
    }

    @Test
    void testFactoryDriving() {
        //Given
        Task task = TaskFactory.createTask(TaskFactory.DRIVING);

        //When
        String taskName = task.getTaskName();

        //Then
        assertEquals("Driving to shopping mall", taskName);
    }
}
