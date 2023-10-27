package com.tulainov.homeworks.homework07.guess_word;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessWord {

    private static String wantedWord;
    private static String answerWord;
    static Scanner scanner = new Scanner(System.in);

    static String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    protected static void printingAnArray() {

        String[][] wordsMatrix = new String[5][5];

        int wordIndex = 0;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                wordsMatrix[row][col] = words[wordIndex];
                wordIndex++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(wordsMatrix[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    protected static void setWantedWord() {

        Random random = new Random();

        int wordIndex = random.nextInt(words.length);

        for (int i = 0; i < words.length; i++) {
            if (i == wordIndex) {
                wantedWord = words[i];
            }
        }
    }

    protected static void checkingUserAnswer() {

        setWantedWord();
        System.out.println("Choose the word from the list:");
        printingAnArray();

        while(true) {

            System.out.println("Answer (type '?' if you want to see the list again): ");

            answerWord = scanner.nextLine();

            if (answerWord.equals("?")) {
                printingAnArray();
                continue;
            }

            if (answerWord.equals(wantedWord)) {
                System.out.println("You won! Congratulations!");
                System.out.println("The word " + getWantedWord() + " is correct!");
                break;
            } else {
                printHashes();
            }

        }
    }

    protected static void printHashes() {

        List<String> hashes = new ArrayList<>();

        for (int i = 0; i <= 14; i++) {
            hashes.add("*");
        }

        for (int i = 0; i < Math.min(wantedWord.length(), answerWord.length()); i++) {
            if (wantedWord.charAt(i) == answerWord.charAt(i)) {
                hashes.set(i, String.valueOf(wantedWord.charAt(i)));

            } else {
                System.out.println("Try again. You can do it!");
                break;
            }
        }

        System.out.println("That's what we've got");

        for (String string : hashes) {
            System.out.print(string);
        }
        System.out.println();
    }

    protected static String getWantedWord() {
        return wantedWord;
    }
}
