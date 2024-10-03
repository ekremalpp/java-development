package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        CellPhone cellPhone = new CellPhone();


        System.out.print("What is the serial number? ");
        cellPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        cellPhone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        cellPhone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        cellPhone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellPhone.setOwner(scanner.nextLine());


        System.out.println("\nCell Phone Details:");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

        scanner.close();
    }
}

