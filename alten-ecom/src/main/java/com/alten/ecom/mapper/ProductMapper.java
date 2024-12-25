package com.alten.ecom.mapper;


import com.alten.ecom.dto.ProductDto;
import com.alten.ecom.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

        public Product toEntity(ProductDto dto);
        public ProductDto toDto(Product dto);
}
