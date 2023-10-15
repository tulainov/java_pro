package com.tulainov.homeworks.homework05.geometry;

import java.util.List;

public abstract class Figure {

    public static double sumOfAreas(List<GeometricFigure> figures) {
        double sum = 0;

        for (GeometricFigure geometricFigure : figures) {
            sum += geometricFigure.area();
        }
        return sum;
    }

}
