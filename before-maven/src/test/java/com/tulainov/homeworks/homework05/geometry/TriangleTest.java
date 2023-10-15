package com.tulainov.homeworks.homework05.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void areaTest() {

        Triangle triangle = new Triangle(7, 8.46);

        double expected = triangle.getHeight() * triangle.getBaseLength() * 0.5;

        Assertions.assertEquals(expected, triangle.area());
    }
}
