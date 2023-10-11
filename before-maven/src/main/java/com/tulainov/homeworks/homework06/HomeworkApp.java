package com.tulainov.homeworks.homework06;

import java.util.Scanner;

public class HomeworkApp {

    public static void main(String[] args) {

        HomeworkApp.startHomework();
    }

    public static void startHomework() {

        HomeworkApp.printThreeWords();
        System.out.println("*".repeat(19));

        System.out.println(HomeworkApp.checkSumSign());
        System.out.println("*".repeat(19));

        System.out.println(HomeworkApp.printColor());
        System.out.println("*".repeat(19));

        System.out.println(HomeworkApp.compareNumbers());
        System.out.println("*".repeat(19));

        System.out.println(HomeworkApp.isSumMoreThanTen());
        System.out.println("*".repeat(19));

        System.out.println("Checking if number 21 is positive.");
        System.out.println(HomeworkApp.isPositiveNumber(21));
        System.out.println("*".repeat(19));

        System.out.println("Checking if -12 is negative number");
        System.out.println(HomeworkApp.isNegative(-12));
        System.out.println("*".repeat(19));

        System.out.println("Printing a line 'bla bla bla' 4 times");
        HomeworkApp.printNTimes("Bla bla bla", 4);
        System.out.println("*".repeat(19));

        System.out.println(HomeworkApp.isYearLeap());
        System.out.println("*".repeat(19));

        System.out.println();
        System.out.println("The homework 6 is done!");
    }

    public static String printThreeWords() {
        return "Orange\n\nBanana\n\nApple";
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
            return "The sum is positive or 0: " + sum;
        } else {
            return "The sum is negative: " + sum;
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

    public static String isPositiveNumber(int number) {

        if (number < 0) {
            return "The number is negative";
        } else {
            return "The number is positive or 0";
        }
    }

    public static boolean isNegative(int number) {

        return number < 0;
    }

    public static void printNTimes(String line, int timesToPrint) {


        if (timesToPrint <= 0) {
            System.out.println("Impossible to complete");
        } else {
            for (int i = 0; i < timesToPrint; i++) {
                System.out.println(line);
            }
        }
    }

    public static boolean isYearLeap() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a year and we'll check if this year is a leap year:");

        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("This is a leap year!");
            return true;
        } else if (year % 100 == 0) {
            System.out.println("This year is not a leap year...");
            return false;
        } else if (year % 4 != 0) {
        System.out.println("This year is not a leap year...");
        return false;
        } else if (year % 4 == 0) {
            System.out.println("This year is a leap year!");
            return true;
        } else {
            System.out.println("Impossible to complete. Wrong year is given.");
            return false;
        }
    }
}
