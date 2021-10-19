package com.shopify.karthik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopify.karthik.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
