package com.tulainov.homeworks.homework05.secondTask.obstacle;

import com.tulainov.homeworks.homework05.secondTask.participant.Participant;

public abstract class Obstacle {

    private String name;
    private double value;

    public Obstacle (String name, double value) {
        this.name = name;
        this.value = value;
    }

    public abstract boolean overcome(Participant participant);

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
