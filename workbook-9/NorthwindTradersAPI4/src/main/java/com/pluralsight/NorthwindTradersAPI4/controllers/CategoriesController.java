package com.pluralsight.NorthwindTradersAPI4.controllers;

import com.pluralsight.NorthwindTradersAPI4.dao.interfaces.ICategoryDao;
import com.pluralsight.NorthwindTradersAPI4.models.Category;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriesController {
    private final ICategoryDao categoryDao;

    public CategoriesController(ICategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories() {
        return categoryDao.getAll();
    }

    @RequestMapping(path = "/categories/{categoryId}", method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable int categoryId) {
        return categoryDao.getById(categoryId);
    }

    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category) {
        return categoryDao.insert(category);
    }
}