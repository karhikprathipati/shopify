package com.shopify.karthik.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopify.karthik.entity.Category;
import com.shopify.karthik.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	public void removeCategoryById(int id){
		categoryRepository.deleteById(id);
	}

	public Optional<Category> updateById(int id) {
		return categoryRepository.findById(id);
	}
}
