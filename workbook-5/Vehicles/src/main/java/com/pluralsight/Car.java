package com.pluralsight;

class Car extends Vehicle {
    int numberOfDoors;

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
