package com.tulainov.homeworks.homework05.secondTask.participant;

public abstract class Participant {

    private String name;
    private double maxLength;
    private double maxHeight;

    public Participant (String name, double maxLength, double maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public abstract boolean run (double length);

    public abstract boolean jump (double height);

    public double getMaxHeight() {
        return maxHeight;
    }

    public double getMaxLength() {
        return maxLength;
    }

    public String getName() {
        return name;
    }
}
