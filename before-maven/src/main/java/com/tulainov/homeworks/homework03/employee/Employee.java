package com.tulainov.homeworks.homework03.employee;

public class Employee {

    private final String name;
    private final String workPosition;
    private final String email;
    private final String number;
    private final int age;

    public Employee(String name, String workPosition, String email,
                    String number, int age) {

        this.name = name;
        this.workPosition = workPosition;
        this.email = email;
        this.number = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }
}
