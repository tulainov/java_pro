package com.tulainov.homeworks.homework05.secondTask.participant;

public class Robot extends Participant {

    public Robot (String name, double maxLength, double maxHeight) {
        super (name, maxLength, maxHeight);
    }

    @Override
    public boolean run(double length) {
        return getMaxLength() >= length;
    }

    @Override
    public boolean jump(double height) {
        return getMaxHeight() >= height;
    }


}
