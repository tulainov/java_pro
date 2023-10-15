package com.tulainov.homeworks.homework05.geometry;

public class Circle extends Figure implements GeometricFigure {

    private final double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
