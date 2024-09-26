package com.pluralsight;

import java.sql.SQLOutput;

public class MathApp {
    public static void main(String[] args) {
        // Question 1 :
         double bobSalary = 1950;
        double garySalary = 1800;
         double  highestSalary = Math.max(bobSalary , garySalary);
        System.out.println("The highest salary");



        // Question 2 :
        int carPrice = 3500;
        int truckPrice = 4000;
        Math.min(carPrice , truckPrice);
        System.out.println("cheaper price");



        // Question 3 :
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area Of Circle" + area);

        //Question 4
        double num = 5.0;
        double route = Math.sqrt(num);
        System.out.println("route is" + route);

        //Question 5
        int x1 = 5 , y1 = 10;
        int x2 = 85 , y2 = 50;
        double distance = Math.sqrt(Math.pow(( x2 - x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("The distance between points is" + distance);

        // Question 6
        double number = -3.8;
        double absoluteValue = Math.abs(number);
        System.out.println("The obsolute of number" + number);

        // Question 7
        double randomNum = Math.random();
        System.out.println("the random number" + randomNum);

    }
}
