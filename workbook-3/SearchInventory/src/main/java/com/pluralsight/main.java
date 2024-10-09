package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Product> inventory = getInventory();
        displayInventory(inventory);
    }
        public static List<Product> getInventory () {
            List<Product> products = new ArrayList<>();
            products.add(new Product("4567", "Shose ", 20.00));
            products.add(new Product("1234", "Hammer", 25.00));
            products.add(new Product("2345", "Box", 10.00));
            products.add(new Product("5678", "Sweatshirt", 12.99));
            products.add(new Product("6789", "Jacket", 10.00));
            return products;
        }

        public static void displayInventory (List < Product > inventory) {
            for (Product product : inventory) {
                System.out.println(product);

            }

        }
    }

