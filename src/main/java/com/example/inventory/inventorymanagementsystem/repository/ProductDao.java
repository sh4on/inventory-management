package com.example.inventory.inventorymanagementsystem.repository;

import com.example.inventory.inventorymanagementsystem.model.Product;

import java.util.Map;

public interface ProductDao {

    void saveProduct(Product product);

    Product getOneProduct(Long id);

    Map<Long, Product> getAllProducts();

    void updateProduct(Product updatedProduct);

    void deleteProduct(Long id);
}
