package com.tulainov.homeworks.homework05.geometry;

public class Triangle extends Figure implements GeometricFigure {

    private final double height;
    private final double baseLength;

    public Triangle (double height, double baseLength) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * height * baseLength;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public double getHeight() {
        return height;
    }
}
