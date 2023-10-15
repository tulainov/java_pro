package com.tulainov.homeworks.homework05.geometry;

public class Square extends Figure implements GeometricFigure {

    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return Math.pow(sideLength, 2);
    }

    public double getSideLength() {
        return sideLength;
    }
}
