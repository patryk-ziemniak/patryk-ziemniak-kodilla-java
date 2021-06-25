package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        this.shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        String result = null;
        for (Shape shape :
                shapes) {
            result += shape.getShapeName() + ", ";
        }
        return result;
    }
}
