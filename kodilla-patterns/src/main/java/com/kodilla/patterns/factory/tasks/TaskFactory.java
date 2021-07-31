package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public static Task createTask(String taskType) {
        switch (taskType) {
            case SHOPPING: return new ShoppingTask("Buying potatoes", "Potatoes", 10.0);
            case PAINTING: return new PaintingTask("Painting Circle", "green", "Circle");
            case DRIVING: return new DrivingTask("Driving to shopping mall", "shopping mall", "car");
            default: return null;
        }
    }
}
