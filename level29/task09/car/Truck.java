package com.javarush.task.task29.task2909.car;

import java.util.Date;

public class Truck extends Car {
    public Truck(int numberOfPassengers) {
        super(Car.TRUCK, numberOfPassengers);
    }

    @Override
    public void fill(double numberOfLiters) throws Exception {
        super.fill(numberOfLiters);
    }

    @Override
    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) {
        return super.getTripConsumption(date, length, SummerStart, SummerEnd);
    }

    @Override
    public int getNumberOfPassengersCanBeTransferred() {
        return super.getNumberOfPassengersCanBeTransferred();
    }

    @Override
    public boolean isDriverAvailable() {
        return super.isDriverAvailable();
    }

    @Override
    public void setDriverAvailable(boolean driverAvailable) {
        super.setDriverAvailable(driverAvailable);
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    @Override
    public void fastenPassengersBelts() {
        super.fastenPassengersBelts();
    }

    @Override
    public void fastenDriverBelt() {
        super.fastenDriverBelt();
    }

    @Override
    public int getMaxSpeed() {
        final int MAX_TRUCK_SPEED = 80;

        return MAX_TRUCK_SPEED;
    }
}
