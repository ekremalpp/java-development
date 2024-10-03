package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new instance of CellPhone
        CellPhone cellPhone = new CellPhone();

        // Prompt user for cell phone information
        System.out.print("What is the serial number? ");
        cellPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        System.out.print("What model is the phone? ");
        cellPhone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        cellPhone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        cellPhone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellPhone.setOwner(scanner.nextLine());

        // Display the properties of the phone
        System.out.println("\nCell Phone Details:");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

        scanner.close();
    }
}

