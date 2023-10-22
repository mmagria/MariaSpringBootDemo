package com.maria.demo.service;

import com.maria.demo.model.Product;
import com.maria.demo.repository.ProductRepository;
import com.maria.demo.request.ProductRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(ProductRequest request){
        Product product = new Product();
        product.setName(request.getName());
        productRepository.save(product);
    }

}
