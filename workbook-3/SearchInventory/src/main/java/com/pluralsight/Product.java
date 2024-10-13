package com.pluralsight;

public class Product {
    private String code;
    private String name;
    private double price;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

         public String toString() {
            return "Product Code: " + code + ", Name: " + name + ", Price: " + price;

        }
    }package com.pluralsight;

public class Product {
    private String code;
    private String name;
    private double price;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product Code: " + code + ", Name: " + name + ", Price: " + price;

    }
}

