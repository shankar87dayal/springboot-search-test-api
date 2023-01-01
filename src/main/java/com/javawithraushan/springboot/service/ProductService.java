package com.javawithraushan.springboot.service;

import com.javawithraushan.springboot.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts (String query);

    Product createProduct(Product product);
}
