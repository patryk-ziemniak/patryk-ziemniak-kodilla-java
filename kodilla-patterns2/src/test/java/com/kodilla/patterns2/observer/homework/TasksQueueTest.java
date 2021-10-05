package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TasksQueueTest {

    @Test
    public void shouldNotifyMentorsAboutNewTasksAndCorrectlySumNotifications() {
        //Given
        TasksQueue janKowalski = new TasksQueue("Jan Kowalski");
        TasksQueue adamNowak = new TasksQueue("Adam Nowak");
        TasksQueue patrykZiemniak = new TasksQueue("Patryk Ziemniak");

        Mentor andrzejJaromin = new Mentor("Andrzej Jaromin");
        patrykZiemniak.registerObserver(andrzejJaromin);
        adamNowak.registerObserver(andrzejJaromin);

        Mentor pawelPluta = new Mentor("Paweł Pluta");
        patrykZiemniak.registerObserver(pawelPluta);
        janKowalski.registerObserver(pawelPluta);

        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        Task task3 = new Task("Task 3");
        Task task4 = new Task("Task 4");
        Task task5 = new Task("Task 5");
        Task task6 = new Task("Task 6");

        //When
        janKowalski.addTaskToQueue(task1);
        adamNowak.addTaskToQueue(task2);
        adamNowak.addTaskToQueue(task3);
        patrykZiemniak.addTaskToQueue(task4);
        patrykZiemniak.addTaskToQueue(task5);
        patrykZiemniak.addTaskToQueue(task6);

        //Then
        assertEquals(5, andrzejJaromin.getNotifyCount());
        assertEquals(4, pawelPluta.getNotifyCount());
    }
}
