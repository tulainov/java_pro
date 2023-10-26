package com.tulainov.homeworks.homework07;

public class Palindrome {

    public static String isPalindrome(String line) {

        boolean palindrome = false;

        StringBuilder builder = new StringBuilder(line);

        String reverse = String.valueOf(builder.reverse());

        if (reverse.equals(line)) {
            palindrome = true;
        }
        return line + " -> " + palindrome;
    }
}
