package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName  = scanner.nextLine();

        System.out.print("Enter show date(dd/mm/yyyy): ");
        String showDate = scanner.nextLine();

        System.out.print("Enter ticket count: ");
        int ticketCount = scanner.nextInt();

        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];
        String ticketString = (ticketCount == 1) ? "ticket" : "tickets";
        System.out.println(ticketCount + " " + ticketString + " reserved  " + showDate + " " + lastName + ", " + firstName);


     }
}
