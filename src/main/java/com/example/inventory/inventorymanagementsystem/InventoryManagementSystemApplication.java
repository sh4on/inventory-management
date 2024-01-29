package com.example.inventory.inventorymanagementsystem;

import com.example.inventory.inventorymanagementsystem.model.Product;
import com.example.inventory.inventorymanagementsystem.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.util.Map;

@SpringBootApplication
public class InventoryManagementSystemApplication implements CommandLineRunner {

    @Autowired
    private ProductDao productDao;

    public static void main(String[] args) {
        SpringApplication.run(InventoryManagementSystemApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Product laptop = new Product(1L, "Laptop", 899.99, 20, Date.valueOf("2022-01-15"));
        Product smartphone = new Product(2L, "Smartphone", 499.99, 30, Date.valueOf("2022-02-10"));
        Product coffeeMaker = new Product(3L, "Coffee Maker", 79.99, 15, Date.valueOf("2022-03-05"));

        productDao.saveProduct(laptop);
        productDao.saveProduct(smartphone);
        productDao.saveProduct(coffeeMaker);


    }
}
