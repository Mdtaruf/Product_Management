package com.productManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productManagement.model.ProductRequestModel;
import com.productManagement.model.ProductResponseModel;
import com.productManagement.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {



	@Autowired
	private ProductService service;
	
	
	@PostMapping("/creat")
	public ResponseEntity<ProductResponseModel> createProduct( @RequestBody @Valid ProductRequestModel product) {
		ProductResponseModel createProduct = service.createProduct(product);
		return new ResponseEntity<>(createProduct, HttpStatus.CREATED);
	}

	@GetMapping("getAll")
	public ResponseEntity<List<ProductResponseModel>> getAllProducts() {
		List<ProductResponseModel> allProducts = service.getAllProducts();
		return new ResponseEntity<>(allProducts, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProductResponseModel> getProductById(@PathVariable Long id) {
		ProductResponseModel product = service.getProductById(id);
		return product != null ? new ResponseEntity<>(product, HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}


	@PutMapping("/update/{id}")
	public ResponseEntity<ProductResponseModel> updateProduct(@PathVariable Long id, @RequestBody ProductRequestModel product) {
		ProductResponseModel updateProduct = service.updateProduct(id, product);
		return new ResponseEntity<>(updateProduct, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
		service.deleteProduct(id);
		return new ResponseEntity<>("Deleted",HttpStatus.NO_CONTENT);
	}

}
