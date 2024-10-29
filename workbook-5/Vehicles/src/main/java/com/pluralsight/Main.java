package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Model X", "Red", 100, 5, 2, 10, 150);


        SemiTruck semiTruck = new SemiTruck("F150","red",150, 5, 3,12, 1);


        HoverCraft hoverCraft = new HoverCraft("asd", "red",123, 123, 12,123,123);


        Car car = new Car("ads","asd",12,123,123,123,123);
        car.setNumberOfDoors(4);
        car.setTopSpeed(200);
        slowRide.ride();
        semiTruck.loadCargo();
        hoverCraft.hover();
        car.openTrunk();

        // Accessing Vehicle getters
        System.out.println("Color of the Moped: " + slowRide.getColor());
        System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
        System.out.println("Air cushion pressure of the HoverCraft: " + hoverCraft.getAirCushionPressure());
        System.out.println("Top speed of the Car: " + car.getTopSpeed());
    }
}
