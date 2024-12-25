package com.alten.ecom.controller;

import com.alten.ecom.dto.ProductDto;
import com.alten.ecom.entity.Product;
import com.alten.ecom.mapper.ProductMapper;
import com.alten.ecom.service.ProductCacheableService;
import com.alten.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final ProductCacheableService productCacheableService;
    private final ProductMapper productMapper;



    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        Product request = productMapper.toEntity(productDto);
        Product response = productService.createProduct(request);

        return productMapper.toDto(response);
    }


    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping
    public List<ProductDto> getAllProducts() {

        return productCacheableService.getAllProducts()
                .stream()
                .map(productMapper::toDto)
                .toList();
    }


    @GetMapping("/{productId}")
    public ProductDto getProduct(@PathVariable Integer productId) {

        return productMapper.toDto(productService.getProduct(productId));
    }


    @PatchMapping("/{productId}")
    public ProductDto updateProduct(@PathVariable Integer productId, @RequestBody ProductDto productDto) {
        Product request = productMapper.toEntity(productDto);

        return productMapper.toDto(productCacheableService.updateProduct(productId, request));
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Integer productId) {

        productService.deleteProduct(productId);
    }

}
