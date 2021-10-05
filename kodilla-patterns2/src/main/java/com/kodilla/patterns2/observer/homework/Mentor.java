package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String name;
    private int notifyCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void notifyObserver(Observable observable, String taskName) {
        System.out.println(name + ": You have new tasks to verify in queue of: " + observable.getName() + "\n" +
                "Task name: " + taskName);
        notifyCount++;
    }

    public String getName() {
        return name;
    }

    public int getNotifyCount() {
        return notifyCount;
    }
}
