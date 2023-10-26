package com.tulainov.homeworks.homework07;

import java.util.Scanner;

public class HomeworkApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void startHomework() {

//        System.out.println("First");
//        symbolOccurrence();
//        System.out.println("Second");
//        findWordPosition();
//        System.out.println("Third");
//        stringReversed();
        System.out.println("Fourth");
        isPalindrome();
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
