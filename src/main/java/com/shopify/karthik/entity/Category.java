package com.shopify.karthik.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="category_id")
	private int id;

	private String name;

	public Category() {
	}

	protected boolean canEqual(final Object other) {
		return other instanceof Category;
	}

}
