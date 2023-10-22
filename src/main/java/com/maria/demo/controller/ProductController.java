package com.maria.demo.controller;

import com.maria.demo.request.ProductRequest;
import com.maria.demo.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(value = "create")
    public ResponseEntity<String> createProduct(ProductRequest productRequest) {
        productService.saveProduct(productRequest);
        return null;
    }
}
