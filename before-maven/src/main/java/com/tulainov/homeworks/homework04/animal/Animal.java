package com.tulainov.homeworks.homework04.animal;

public class Animal {

    private static int animalCount;

    public Animal() {
        animalCount++;
    }

    public boolean run(int limit) {
        System.out.println("Animal runs");
        return true;
    }

    public boolean swim(int limit) {
        System.out.println("Animal swims");
        return true;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
