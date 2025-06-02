package com.gmail.zernetcsgo.hw12;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car has been started successfully.");
    }

    private void startElectricity() {
        System.out.println("Starting electrical system...");
    }

    private void startCommand() {
        System.out.println("Sending control commands...");
    }

    private void startFuelSystem() {
        System.out.println("Starting fuel system...");
    }
}
