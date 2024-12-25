package com.alten.ecom.service;

import com.alten.ecom.entity.Product;
import com.alten.ecom.exception.EntityNotFound;
import com.alten.ecom.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCacheableService {

    private final ProductService productService;








    @Cacheable(value = "productsCache")
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }


    @CacheEvict(value = "productsCache", allEntries = true)
    public Product updateProduct(Integer productId, Product request) {

        return productService.updateProduct(productId, request);
    }






}
