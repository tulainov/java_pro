package com.tulainov.homeworks.homework08;

public class ArrayValueCalculator {

    public int doCalc (String[][] array) {

        String arraySizeExceptionMessage = "The array should be [4][4]";
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

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                try {
                    sum += Integer.parseInt(array[i][j]);

                } catch (NumberFormatException exception) {
                    throw new ArrayDataException("Wrong data in index: " + array[i][j], exception);
                }
            }
        }

        return sum;
    }
}
