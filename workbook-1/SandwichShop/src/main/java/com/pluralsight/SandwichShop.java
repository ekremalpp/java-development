package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Size Of sandwich (1: Regular , 2: Large ) : ");
        int size = scanner.nextInt();

         double basePrice = 0;
         if(size == 1) {
             basePrice = 5.45;
         } else if ( size == 2) {
             basePrice = 8.95;
         } else {
             System.out.println("involve size selection");
             return;
         }
        System.out.print ("Enter your age: ");
         int age = scanner.nextInt();

         double discount = 0;
         if (age <= 17) {
             discount = 0.10;
         } else if ( age >=65) {
             discount = 0.20;
         }

         double finalPrice = basePrice * (1 - discount);
        System.out.print("final price " + finalPrice);
        scanner.close();

    }

}



