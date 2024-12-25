package com.alten.ecom.service;

import com.alten.ecom.dto.ProductDto;
import com.alten.ecom.entity.Product;
import com.alten.ecom.exception.EntityNotFound;
import com.alten.ecom.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;


    public Product createProduct(Product request) {

        return productRepository.save(request);
    }


    public List<Product> getAllProducts() {


        return productRepository.findAll();
    }

    public Product getProduct(Integer productId) {

        return productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFound("Product not found"));
    }


    public Product updateProduct(Integer productId, Product request) {

        productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFound("Product not found"));

        request.setId(productId);//TODO add controle on fields

        return productRepository.save(request);
    }


    public void deleteProduct(Integer productId) {

        productRepository.deleteById(productId);
    }
}
