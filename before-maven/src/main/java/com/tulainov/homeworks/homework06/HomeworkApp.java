package com.tulainov.homeworks.homework06;

import java.util.Scanner;

public class HomeworkApp {

    public static void main(String[] args) {

        System.out.println(HomeworkApp.checkSumSign());
    }

    public static void printThreeWords() {
        System.out.println("Orange.\n\nBanana.\n\nApple.");
    }

    public static String checkSumSign() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type two number. ");
        System.out.println("The first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("The second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        if(sum >= 0) {
            return "The sum is positive or 0";
        } else {
            return "The sum is negative";
        }
    }
}
