package com.pluralsight.NorthwindTradersAPI2.controllers;

import com.pluralsight.NorthwindTradersAPI2.models.Category;
import com.pluralsight.NorthwindTradersAPI2.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {
    private List<Category> categories = new ArrayList<>();

    public CategoriesController() {
        // Sample categories for demonstration
        categories.add(new Category(1, "Category A"));
        categories.add(new Category(2, "Category B"));
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categories;
    }

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categories.stream().filter(category -> category.getCategoryId() == id).findFirst().orElse(null);
    }
}
