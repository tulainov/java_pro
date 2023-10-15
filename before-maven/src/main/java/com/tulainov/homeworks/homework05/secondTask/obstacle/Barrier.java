package com.tulainov.homeworks.homework05.secondTask.obstacle;

import com.tulainov.homeworks.homework05.secondTask.participant.Participant;

public class Barrier extends Obstacle {

    public Barrier (String name, double height) {
        super (name, height);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(getValue());
    }
}
