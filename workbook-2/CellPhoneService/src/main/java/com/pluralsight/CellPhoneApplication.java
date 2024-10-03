package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        CellPhone phone1 = new CellPhone();
        inputPhoneDetails(phone1, scanner);


        CellPhone phone2 = new CellPhone();
        inputPhoneDetails(phone2, scanner);


        display(phone1);
        display(phone2);


        phone1.dial(phone2.getPhoneNumber());

        phone2.dial(phone1.getPhoneNumber());

        scanner.close();
    }


    private static void inputPhoneDetails(CellPhone phone, Scanner scanner) {
        System.out.print("What is the serial number? ");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine(); // Clear the newline

        System.out.print("What is the model of the phone? ");
        phone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(scanner.nextLine());
    }


    public static void display(CellPhone phone) {
        System.out.println("\nPhone Information:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}