package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName = "Triangle";
    private double sideLength;
    private double height;

    public Triangle(double sideLength, double height) {
        this.sideLength = sideLength;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return sideLength * height / 2;
    }

    @Override
    public String toString() {
        return shapeName + " with side length of " + sideLength + " cm and height of " + height + " cm";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideLength, sideLength) != 0) return false;
        if (Double.compare(triangle.height, height) != 0) return false;
        return getShapeName().equals(triangle.getShapeName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getShapeName().hashCode();
        temp = Double.doubleToLongBits(sideLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
