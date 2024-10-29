package com.pluralsight;

class HoverCraft extends Vehicle{
    int airCushionPressure;

    public HoverCraft(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int airCushionPressure) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.airCushionPressure = airCushionPressure;
    }

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    protected void hover() {

    }
}
