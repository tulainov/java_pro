package com.tulainov.homeworks.homework06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkAppTest {

    @Test
    void printThreeWordsTest() {

        String expected = "Orange\n\nBanana\n\nApple";

        Assertions.assertEquals(expected, HomeworkApp.printThreeWords());
    }

    @Test
    void isPositiveNumberTest() {

        String expected = "The number is negative";

        Assertions.assertEquals(expected, HomeworkApp.isPositiveNumber(-1));
    }

    @Test
    void isNegativeTest() {

        Assertions.assertFalse(HomeworkApp.isNegative(4));
    }

}
