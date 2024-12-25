package com.alten.ecom.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ProductDto {

    private Integer id;

    private String code;

    private String name;

    private String description;

    private String image;

    private String category;

    private Double price;

    private Short quantity;

    private String internalReference;

    private Integer shellId;

    private String inventoryStatus;

    private Integer rating;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;


}
