package com.tulainov.homeworks.homework07;

public class FindWordPosition {

    public static String findWordPosition(String source, String target) {

        int index = 0;

        if (source.contains(target)) {
            index = source.indexOf(target);
        } else {
            index = -1;
        }

        return "Result: " + index;
    }

}
