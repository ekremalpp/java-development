package com.pluralsight.NorthwindTradersAPI2.controllers;

import com.pluralsight.NorthwindTradersAPI2.models.Product;
import com.pluralsight.NorthwindTradersAPI2.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
    private List<Product> products = new ArrayList<>();

    public ProductsController() {
        // Sample products for demonstration
        products.add(new Product(1, "Product A", 1, 10.0));
        products.add(new Product(2, "Product B", 1, 20.0));
        products.add(new Product(3, "Product C", 2, 30.0));
        products.add(new Product(4, "Product D", 2, 40.0));
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return products;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return products.stream().filter(product -> product.getProductId() == id).findFirst().orElse(null);
    }
}
