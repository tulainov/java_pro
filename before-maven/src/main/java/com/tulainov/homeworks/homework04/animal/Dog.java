package com.tulainov.homeworks.homework04.animal;

public class Dog extends Animal{

    private final int runLimit = 500;
    private final int swimLimit = 10;

    @Override
    public boolean run(int limit) {

        if (limit > runLimit) {
            System.out.println("Dog cannot run that much");
            return false;
        } else {
            System.out.println("Dog runs " + limit + " meter");
            return true;
        }
    }

    @Override
    public boolean swim(int limit) {

        if (limit > swimLimit) {
            System.out.println("Dog cannot swim that much");
            return false;
        } else {
            System.out.println("Dog swims " + limit + " meter");
            return true;
        }
    }

}
