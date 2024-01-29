package com.example.inventory.inventorymanagementsystem.repository.impl;

import com.example.inventory.inventorymanagementsystem.exception.ProductNotFoundException;
import com.example.inventory.inventorymanagementsystem.model.Product;
import com.example.inventory.inventorymanagementsystem.repository.ProductDao;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ProductDaoImpl implements ProductDao {
    private final String hashReference = "Product";

    @Resource(name = "redisTemplate")
    private HashOperations<String, Long, Product> hashOperations;

    @Override
    public void saveProduct(Product product) {
        hashOperations.putIfAbsent(hashReference, product.getId(), product);
    }

    @Override
    public Product getOneProduct(Long id) {
        Product product = hashOperations.get(hashReference, id);

        if (product == null) {
            String message = String.format("Product with ID %d not found.", id);
            throw new ProductNotFoundException(message);
        }

        return product;
    }

    @Override
    public Map<Long, Product> getAllProducts() {
        return hashOperations.entries(hashReference);
    }

    @Override
    public void updateProduct(Product updatedProduct) {
        getOneProduct(updatedProduct.getId());
        hashOperations.put(hashReference, updatedProduct.getId(), updatedProduct);
    }

    @Override
    public void deleteProduct(Long id) {
        getOneProduct(id);
        hashOperations.delete(hashReference, id);
    }
}
