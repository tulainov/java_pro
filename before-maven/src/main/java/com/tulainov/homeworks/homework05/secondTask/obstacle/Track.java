package com.tulainov.homeworks.homework05.secondTask.obstacle;

import com.tulainov.homeworks.homework05.secondTask.participant.Participant;

public class Track extends Obstacle {

    public Track (String name, double length) {

        super (name, length);
    }

    @Override
    public boolean overcome(Participant participant) {

        return participant.run(getValue());
    }
}
