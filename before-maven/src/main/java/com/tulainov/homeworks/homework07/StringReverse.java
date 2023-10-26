package com.tulainov.homeworks.homework07;

public class StringReverse {

    public static String stringReversed(String line) {

        StringBuilder builder = new StringBuilder(line);

        return line + " -> " + builder.reverse();
    }
}
