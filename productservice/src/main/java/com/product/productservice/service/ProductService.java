package com.product.productservice.service;

import com.product.productservice.entity.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Long id);

    Product createProduct(Product product);

    List<Product> getAllProducts();
}
