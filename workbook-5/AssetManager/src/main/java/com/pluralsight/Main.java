package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset>assets= new ArrayList<>();

        House house2 = new House("House", "2020-01-05", 500000.0, "632 Chattham",2,2312,3123);
        House house1 = new House("Home", "2023-05-01",4000.0, "12 Main st",2 ,1321,20000);

        Vehicle vehicle2 = new Vehicle("car"," 2020-21-21",32000.0,"Porche",2021,5000);
        Vehicle vehicle1= new Vehicle("My Father's car", "2020-05-01",23221.0,"masserati",2020,8000);

        assets.add(house2);
        assets.add(house1);
        assets.add(vehicle2);
        assets.add(vehicle1);

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
            }
            System.out.println("Value: $" + asset.getValue());
            System.out.println();
        }
    }
    }




