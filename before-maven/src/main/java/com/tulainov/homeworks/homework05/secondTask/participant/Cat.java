package com.tulainov.homeworks.homework05.secondTask.participant;

public class Cat extends Participant {

    public Cat(String name, double maxLength, double maxHeight) {
        super (name, maxLength, maxHeight);
    }

    @Override
    public boolean run (double length) {
        return getMaxLength() >= length;
    }

    @Override
    public boolean jump (double height) {
        return getMaxHeight() >= height;
    }
}
