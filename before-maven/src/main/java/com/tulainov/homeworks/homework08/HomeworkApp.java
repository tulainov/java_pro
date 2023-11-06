package com.tulainov.homeworks.homework08;

import java.util.Random;

public class HomeworkApp {

    public static void start() {

        Random random = new Random();
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] numbersArray = new String[4][4];

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < numbersArray[i].length; j++) {
                numbersArray[i][j] = String.valueOf(random.nextInt(5));
            }
        }

        System.out.println(calculator.doCalc(numbersArray));
    }
}
