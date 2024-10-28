package com.pluralsight;

class SemiTruck extends Vehicle {
    int numberOfTrailers;

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    protected   void loadCargo() {

    }
    protected void  unloadCargo() {

    }
}
