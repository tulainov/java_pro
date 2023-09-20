package com.tulainov.homeworks.homework04.animal;

public class Cat extends Animal {

    private final int runLimit = 200;

    @Override
    public boolean run (int limit) {

        if (limit > runLimit) {
            System.out.println("Cat cannot run that much");
            return false;
        } else {
            System.out.println("Cat runs " + limit + " meter");
            return true;
        }
    }

    @Override
    public boolean swim (int limit) {

        System.out.println("Cats don't swim!");
        return false;
    }
}
