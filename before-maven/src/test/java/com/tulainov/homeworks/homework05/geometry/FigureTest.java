package com.tulainov.homeworks.homework05.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FigureTest {

    @Test
    public void areaSumTest() {

        List<GeometricFigure> figures = new ArrayList<>();

        figures.add(new Triangle(1, 1));
        figures.add(new Square(1));
        figures.add(new Circle(1));

        double sum = 0;

        for (GeometricFigure figure : figures) {
            sum += figure.area();
        }

        Assertions.assertEquals(sum, Figure.sumOfAreas(figures));
    }
}