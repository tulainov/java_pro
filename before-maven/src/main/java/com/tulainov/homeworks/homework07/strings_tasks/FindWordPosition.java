package com.tulainov.homeworks.homework07.strings_tasks;

public class FindWordPosition {

    public static String findWordPosition(String source, String target) {

        int index;

        if (source.contains(target)) {
            index = source.indexOf(target);
        } else {
            index = -1;
        }

        return "The wanted substring begins with index: " + index;
    }

}
