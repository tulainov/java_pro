package com.tulainov.homeworks.homework07;

/*
        print array() -> choosing the word() -->

        getting the word from user() -> printing hashes() -->

        everything together()
 */

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

    public static void printingAnArray() {

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

    public static void setWantedWord() {

        Random random = new Random();

        int wordIndex = random.nextInt(words.length);

        for (int i = 0; i < words.length; i++) {
            if (i == wordIndex) {
                wantedWord = words[i];
            }
        }
    }

    private static void checkingUserAnswer() {

        setWantedWord();
        System.out.println("Choose the word from the list:");
        printingAnArray();

        while(true) {

            System.out.println("Answer: ");

            answerWord = scanner.nextLine();

            if (answerWord.equals(wantedWord)) {
                System.out.println("You won! Congratulations!");
                break;
            } else {
                printHashes();
            }

        }
    }

    private static void printHashes() {


    }

    public static String getWantedWord() {
        return wantedWord;
    }
}
