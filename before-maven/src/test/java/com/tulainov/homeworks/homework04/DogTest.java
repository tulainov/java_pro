package com.tulainov.homeworks.homework04;

import com.tulainov.homeworks.homework04.animal.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DogTest {

    @Test
    public void runTest() {

        Dog dog = new Dog();

        Assertions.assertFalse(dog.run(700));
        Assertions.assertTrue(dog.run(350));
    }

    @Test
    public void swimTest() {
        Dog dog = new Dog();

        Assertions.assertFalse(dog.swim(71));
        Assertions.assertTrue(dog.swim(4));
    }
}
