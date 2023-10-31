package com.tulainov.homeworks.homework08;

public class ArrayValueCalculator {

    private final String arraySizeExceptionMessage = "The array should be [4][4]";

    public int doCalc (String[][] array) {

        int sum = 0;

        if (array == null) {
            throw new ArraySizeException("This array is null!");
        } else if (array.length != 4) {
            throw new ArraySizeException(arraySizeExceptionMessage);
        } else {
            for (String[] strings : array) {
                if (strings.length != 4) {
                    throw new ArraySizeException(arraySizeExceptionMessage);
                }
            }
        }

        return sum;
    }
}
