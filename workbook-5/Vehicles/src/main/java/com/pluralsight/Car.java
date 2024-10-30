package com.pluralsight;

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int numberOfDoors) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    protected   void openTrunk() {

    }
   protected void closeTrunk() {

    }
}
