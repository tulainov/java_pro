package com.tulainov.homeworks.homework06;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class HomeworkApp {

    public static void main(String[] args) {

//        System.out.println(HomeworkApp.checkSumSign());

//        System.out.println(HomeworkApp.isSumMoreThanTen());

        HomeworkApp.printThreeWords();

        System.out.println("*".repeat(19));

        System.out.println(HomeworkApp.isSumMoreThanTen());

        System.out.println("*".repeat(19));

        System.out.println(HomeworkApp.checkSumSign());

        System.out.println("*".repeat(19));

        System.out.println(HomeworkApp.printColor());

        System.out.println("*".repeat(19));

        System.out.println(HomeworkApp.compareNumbers());
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

    public static String printColor() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type please any number and you will get the color of this number (due to task):");
        int value = scanner.nextInt();

        if (0 < value && value <= 100) {
            return "Yellow";
        } else if (value <= 0) {
            return "Red";
        } else {
            return "Green";
        }
    }

    public static String compareNumbers() {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Write two numbers, and then they're going to be compared:");

        System.out.println("First:");
        int firstNumber = scanner.nextInt();
        System.out.println("Second:");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            return firstNumber + " < " + secondNumber;
        } else {
            return firstNumber + " >= " + secondNumber;
        }
    }

    public static boolean isSumMoreThanTen() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write two numbers and we'll check if their sum is from ten to twenty!");

        System.out.println("First:");
        int firstNum = scanner.nextInt();
        System.out.println("Second:");
        int secondNum = scanner.nextInt();

        int sum = firstNum + secondNum;

        if (10 <= sum && sum <= 20) {
            System.out.println("It's indeed between 10 and 20!");
            return true;
        } else {
            System.out.println("No, sadly it's not there...");
            return false;
        }
    }
}
