package com.tulainov.homeworks.homework05.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    public void areaTest() {

        Square square = new Square(12.436);

        double expected = Math.pow(square.getSideLength(), 2);

        Assertions.assertEquals(expected, square.area());
    }
}
