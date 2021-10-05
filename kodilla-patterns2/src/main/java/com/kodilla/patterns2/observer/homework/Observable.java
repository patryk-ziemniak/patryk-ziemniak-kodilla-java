package com.kodilla.patterns2.observer.homework;

public interface Observable {

    void registerObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObservers(String elementName);

    String getName();
}
