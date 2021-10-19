package com.shopify.karthik.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Name;
    @ManyToOne
    @JoinColumn(name="category_id",referencedColumnName = "category_id")
    private Category category;

    private double price;
    private double weight;
    private String description;
    private String imageName;

}
