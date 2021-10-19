package com.shopify.karthik.dto;
import lombok.Data;
@Data
public class ProductDTO {
    private Long id;
    private String Name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
