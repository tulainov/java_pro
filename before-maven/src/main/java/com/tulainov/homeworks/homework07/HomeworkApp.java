package com.tulainov.homeworks.homework07;

import com.tulainov.homeworks.homework07.guess_word.StartingGame;
import com.tulainov.homeworks.homework07.strings_tasks.FindSymbolOccurrence;
import com.tulainov.homeworks.homework07.strings_tasks.FindWordPosition;
import com.tulainov.homeworks.homework07.strings_tasks.Palindrome;
import com.tulainov.homeworks.homework07.strings_tasks.StringReverse;

import java.util.Scanner;

public class HomeworkApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void startHomework() {

        String userAnswer = "";

        System.out.println("""
                Welcome to Homework 7!
                I learn strings here and I'm happy to see you here.
                
                Just pick a number and have fun!
                """);


        while (!(userAnswer.equals("quit"))) {



            System.out.println("""
                1 - Find a symbol in string line
                2 - Find a substring in line
                3 - Type a string and let's see it reversed
                4 - Type something and let's check if it's a palindrome
                5 - Guess Word Game
                quit - finish homework 7
                    """);

            userAnswer = scanner.nextLine();

            switch (userAnswer) {
                case "1" -> symbolOccurrence();
                case "2" -> findWordPosition();
                case "3" -> stringReversed();
                case "4" -> isPalindrome();
                case "5" -> StartingGame.startGame();
            }
        }

        System.out.println("Thank you! Have a great day!");
    }

    private static void symbolOccurrence() {

        System.out.println("Type a string line:");
        String input = scanner.nextLine();

        System.out.println("Now type a symbol that you want to find in your line");
        char symbol = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.println(FindSymbolOccurrence.findSymbolOccurrence(input, symbol));
    }

    private static void findWordPosition() {

        System.out.println("Type a string line:");
        String input = scanner.nextLine();

        System.out.println("Let's check if in your first string there is a substring");
        System.out.println("Type a substring:");

        String substring = scanner.nextLine();

        System.out.println(FindWordPosition.findWordPosition(input, substring));
    }

    private static void stringReversed() {

        System.out.println("Type a string and let's see it reversed:");
        String input = scanner.nextLine();

        System.out.println(StringReverse.stringReversed(input));
    }

    private static void isPalindrome() {

        System.out.println("Type a string line or just word and we'll check if this word is palindrome:");
        String input = scanner.nextLine();

        System.out.println(Palindrome.isPalindrome(input));
    }
}
