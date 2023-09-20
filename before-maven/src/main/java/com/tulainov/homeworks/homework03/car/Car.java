package com.tulainov.homeworks.homework03.car;

public class Car {

    public void start() {

        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity runs");
    }

    private void startCommand() {
        System.out.println("Command start");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system runs");
    }
}
