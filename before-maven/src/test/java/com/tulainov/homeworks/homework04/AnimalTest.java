package com.tulainov.homeworks.homework04;

import com.tulainov.homeworks.homework04.animal.Animal;
import com.tulainov.homeworks.homework04.animal.Cat;
import com.tulainov.homeworks.homework04.animal.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    public void animalCountTest() {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Animal();
        Animal animal1 = new Dog();

        Assertions.assertEquals(4, Animal.getAnimalCount());
    }
}
