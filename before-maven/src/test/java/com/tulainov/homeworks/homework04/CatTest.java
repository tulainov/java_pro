package com.tulainov.homeworks.homework04;

import com.tulainov.homeworks.homework04.animal.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {

    @Test
    public void runTest() {

        Cat cat = new Cat();

        Assertions.assertFalse(cat.run(700));
        Assertions.assertTrue(cat.run(70));
    }

    @Test
    public void swimTest() {

        Cat cat = new Cat();

        Assertions.assertFalse(cat.swim(1));
    }
}
