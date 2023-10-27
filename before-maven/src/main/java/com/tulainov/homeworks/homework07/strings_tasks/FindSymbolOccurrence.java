package com.tulainov.homeworks.homework07.strings_tasks;

public class FindSymbolOccurrence {

    public static String findSymbolOccurrence(String source, char symbol) {

        int occurrence = 0;

        if (source == null) {
            return "The input line is null!";
        }

        char[] chars = source.toCharArray();

        for (char character : chars) {
            if (character == symbol) {
                occurrence++;
            }
        }


        if (source.contains(String.valueOf(symbol))) {
            return "The line: '" + source + "' has '" + symbol + "' for " + occurrence + " times.";
        } else {
            return "The symbol '" + symbol + "' is not in line: " + source;
        }
    }

}
