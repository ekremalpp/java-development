package com.pluralsight.NorthwindTradersAPI4.controllers;

import com.pluralsight.NorthwindTradersAPI4.dao.interfaces.IProductDao;
import com.pluralsight.NorthwindTradersAPI4.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {
    private final IProductDao productDao;

    public ProductsController(IProductDao productDao) {
        this.productDao = productDao;
    }

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return productDao.getAll();
    }

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable int productId) {
        return productDao.getById(productId);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productDao.insert(product);
    }
}