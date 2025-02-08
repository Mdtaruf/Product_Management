package com.productManagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductRequestModel {

	@NotBlank(message = "Name is required")
	@Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
	public String name;

	@NotBlank(message = "Description is mandatory")
	public String description;

	@NotNull(message = "Price is mandatory")
	@Positive(message = "Price must be greater than 0")
	public Double price;

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized String getDescription() {
		return description;
	}

	public synchronized void setDescription(String description) {
		this.description = description;
	}

	public synchronized Double getPrice() {
		return price;
	}

	public synchronized void setPrice(Double price) {
		this.price = price;
	}
	
	

	
}
