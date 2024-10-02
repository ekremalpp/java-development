package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AdressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder adressBuilder = new StringBuilder();

        System.out.print("full name: ");
        String fullName = scanner.nextLine();
        adressBuilder.append("full name: ").append(fullName).append(" \n");

        System.out.print("Billing street: ");
        String billingStreet = scanner.nextLine();
        adressBuilder.append("Billing street: ").append(billingStreet).append(" \n");

        System.out.print("Billing city: ");
        String billingCity = scanner.nextLine();
        adressBuilder.append("Billing city: ").append(billingCity).append(" \n");

        System.out.print("Billing state: ");
        String billingState = scanner.nextLine();
        adressBuilder.append("Billing Sate:").append(billingState).append(" \n");

        System.out.print("Billing zip: ");
        String billingZip = scanner.nextLine();
        adressBuilder.append("Billing zip: ").append(billingZip).append("  \n");

        System.out.println("Shipping street: ");
        String shippingStreet = scanner.nextLine();
        adressBuilder.append("Shipping street: ").append(shippingStreet).append(" \n");

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        adressBuilder.append("shipping city: ").append(shippingCity).append(" \n");

        System.out.print("shipping state: ");
        String shippingState = scanner.nextLine();
        adressBuilder.append("shipping state: ").append(shippingState).append(" \n");

        System.out.println("shipping zip: ");
        String shippingZip = scanner.nextLine();
        adressBuilder.append("shipping zip: ").append(shippingZip).append(" \n");


        System.out.println("/n Costumer infromation:");
        System.out.println(adressBuilder.toString());

        scanner.close();






    }
}
