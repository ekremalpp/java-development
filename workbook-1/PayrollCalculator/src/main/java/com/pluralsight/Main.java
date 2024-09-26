package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Name and Lastname: ");
        String name = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();


        System.out.print("Entered payRate: ");
        double payRate = scanner.nextDouble();

        double grossPay = hoursWorked * payRate;
        System.out.print("Employee Name" + name +"grossPay" + grossPay );
    }
}
