package com.product.productservice.serviceimpl;

import com.product.productservice.entity.Product;
import com.product.productservice.repo.ProductRepository;
import com.product.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository prodRepo;

    @Override
    public Product getProduct(Long id) {
        Optional<Product> product= Optional.ofNullable(prodRepo.findById(id).orElseThrow(() -> new RuntimeException("No Product with this id" + id)));
        return product.get();
    }

    @Override
    public Product createProduct(Product product) {
       Product productSaved= prodRepo.save(product);
        return productSaved;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> productList=prodRepo.findAll();
        return productList;
    }
}
