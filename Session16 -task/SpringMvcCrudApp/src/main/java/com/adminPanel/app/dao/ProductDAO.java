package com.adminPanel.app.dao;

import com.adminPanel.app.model.Product;

import java.util.List;

public interface ProductDAO {
    void addProduct(Product product);
    Product findById(int id);
    void deleteById(int id);
    void updateProduct(Product product);
    List<Product> getAllProducts();
}