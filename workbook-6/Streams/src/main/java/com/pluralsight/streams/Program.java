package com.pluralsight.streams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", 25));
        people.add(new Person("Ekrem", "Kalp", 27));
        people.add(new Person("Yahya", "Uzun", 30));
        people.add(new Person("Kamil", "Doe", 20));
        people.add(new Person("Ayse", "kibar", 31));
        people.add(new Person("Grace", "Miller", 19));
        people.add(new Person("Oscar", "Garcia", 45));
        people.add(new Person("Ivy", "Martinez", 32));
        people.add(new Person("Paul", "Rodriguez", 27));
        people.add(new Person("Bob","Brown",35));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name (first or last) to search: ");
        String searchName = scanner.nextLine().trim().toLowerCase();

        List<Person>matchPeople = new ArrayList<>();

        for(Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName)) {
                person.getLastName().equalsIgnoreCase(searchName);
                matchPeople.add(person);
            }

        }

        if (matchPeople.isEmpty()) {
            System.out.println("Can not found name with that time");

        } else {
            System.out.println("people matched" + searchName + ":");
            for (Person person : matchPeople) {
                System.out.println(person);
            }
        }
        scanner.close();
    }
}
