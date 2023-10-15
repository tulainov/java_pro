package com.tulainov.homeworks.homework05.secondTask;

import com.tulainov.homeworks.homework05.secondTask.obstacle.Barrier;
import com.tulainov.homeworks.homework05.secondTask.obstacle.Obstacle;
import com.tulainov.homeworks.homework05.secondTask.obstacle.Track;
import com.tulainov.homeworks.homework05.secondTask.participant.Cat;
import com.tulainov.homeworks.homework05.secondTask.participant.Human;
import com.tulainov.homeworks.homework05.secondTask.participant.Participant;
import com.tulainov.homeworks.homework05.secondTask.participant.Robot;

import java.util.ArrayList;
import java.util.List;

public class ParticipantOvercomesObstacles {

    public static void startRace() {

        int countOfObstacles = 0;

        List<Participant> participants = new ArrayList<>();

        participants.add(new Human("John", 8000, 2.3));
        participants.add(new Robot("Beep Bop", 15000, 5.9));
        participants.add(new Cat("Kitty", 500, 3));

        List<Obstacle> obstacles = new ArrayList<>();

        obstacles.add(new Track("Short track", 200));
        obstacles.add(new Barrier("Low barrier", 2));
        obstacles.add(new Track("Long track", 13000));
        obstacles.add(new Barrier("High barrier", 10));

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.overcome(participant)) {
                    countOfObstacles++;
                    System.out.println("Participant " + participant.getName() + " overcame the " +
                            obstacle.getName() + ". The length/height of an obstacle: " + obstacle.getValue());
                    System.out.println("-".repeat(15));
                } else {
                    System.out.println("Participant " + participant.getName() + " could not overcome the " +
                            obstacle.getName() +".\nThe length/height of an obstacle: " + obstacle.getValue()
                     + "\nThe count of overcome obstacles: " + countOfObstacles);
                    System.out.println("-".repeat(15));
                    countOfObstacles = 0;
                    break;
                }
            }
        }
        System.out.println("Race is done!");
    }
}
