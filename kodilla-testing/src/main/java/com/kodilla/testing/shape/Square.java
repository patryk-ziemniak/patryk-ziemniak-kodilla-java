package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName = "Square";
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return this.sideLength * this.sideLength;
    }

    @Override
    public String toString() {
        return shapeName + " with sides length of " + sideLength + " cm";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.sideLength, sideLength) != 0) return false;
        return getShapeName().equals(square.getShapeName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getShapeName().hashCode();
        temp = Double.doubleToLongBits(sideLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
