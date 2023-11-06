package com.tulainov.homeworks.homework08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkAppTest {

    @Test
    public void arraySizeExceptionTest() {

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] strings = new String[4][5];

        Assertions.assertThrows(ArraySizeException.class, () -> calculator.doCalc(strings));
    }

    @Test
    public void arrayDataExceptionTest() {

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] strings = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"},
                {"1", "1", "1", "aifu"}};

        Assertions.assertThrows(ArrayDataException.class, () -> calculator.doCalc(strings));
    }

    @Test
    public void arraySizeExceptionNullTest() {

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        Assertions.assertThrows(ArraySizeException.class, () -> calculator.doCalc(null));
    }

    @Test
    public void arrayCalculatorSumTest() {

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] strings = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};

        Assertions.assertEquals(16, calculator.doCalc(strings));
    }
}

