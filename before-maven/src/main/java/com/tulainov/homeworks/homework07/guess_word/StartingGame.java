package com.tulainov.homeworks.homework07.guess_word;

public class StartingGame {

    public static void startGame() {

        System.out.println("Welcome to the Guess Word Game");
        System.out.println("""
                Let me explain you the rules. You have a list of words - 
                one of these words I will pick and you'll have to guess 
                which word I picked.
                Let's begin.
                """);

        GuessWord.checkingUserAnswer();
    }
}
