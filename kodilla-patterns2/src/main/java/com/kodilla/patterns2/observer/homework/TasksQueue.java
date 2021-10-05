package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksQueue implements Observable {

    private String userName;
    private Deque<Task> tasks;
    private List<Observer> observers;

    public TasksQueue(String userName) {
        this.userName = userName;
        this.tasks = new ArrayDeque<>();
        this.observers = new ArrayList<>();
    }

    public void addTaskToQueue(Task task) {
        tasks.offer(task);
        notifyObservers(task.getName());
    }

    public Task getTaskFromQueue() {
        return tasks.poll();
    }

    public boolean removeTaskFromQueue(Task task) {
        return tasks.remove(task);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers(String taskName) {
        for (Observer observer :
                observers) {
            observer.notifyObserver(this, taskName);
        }
    }

    @Override
    public String getName() {
        return userName;
    }

    public String getUserName() {
        return userName;
    }

    public Deque<Task> getTasks() {
        return tasks;
    }
}
