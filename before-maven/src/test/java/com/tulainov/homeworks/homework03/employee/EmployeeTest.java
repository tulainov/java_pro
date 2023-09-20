package com.tulainov.homeworks.homework03.employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void firstTest() {

        Employee john = new Employee("John Snow", "North Explorer", "knowsnothing@gmail.com",
                "18619819848", 29);

        Assertions.assertSame("John Snow", john.getName());
    }

    @Test
    public void secondTest() {

        Employee trevor = new Employee("Trevor Philips", "CEO at 'Trevor Philips Enterprises",
                "tboss@gmail.com", "84498413516", 50);

        Assertions.assertEquals(50, trevor.getAge());

    }
}
