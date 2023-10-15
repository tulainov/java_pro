package com.tulainov.homeworks.homework05.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void areaTest() {

        Circle circle = new Circle(93.96);

        double expected = Math.pow(circle.getRadius(), 2) * Math.PI;

        Assertions.assertEquals(expected, circle.area());
    }
}
