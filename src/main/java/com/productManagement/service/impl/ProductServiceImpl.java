package com.productManagement.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productManagement.entity.Product;
import com.productManagement.exception.ProductNotFoundException;
import com.productManagement.model.ProductRequestModel;
import com.productManagement.model.ProductResponseModel;
import com.productManagement.repository.ProductRepository;
import com.productManagement.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<ProductResponseModel> getAllProducts() {
		List<Product> products = productRepository.findAll();

		return products.stream().map(this::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public ProductResponseModel getProductById(Long id) {

		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Product not found"));

		return convertToDTO(product);
	}

	@Override
	public ProductResponseModel createProduct(ProductRequestModel productRequest) {
		Product product = new Product();
		product.setpName(productRequest.getName());
		product.setpDescription(productRequest.getDescription());
		product.setpPrice(productRequest.getPrice());
		product = productRepository.save(product);

		return convertToDTO(product);
	}

	@Override
	public ProductResponseModel updateProduct(Long id, ProductRequestModel productRequestModel) {
		Product existingProduct = productRepository.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Product not found"));
		existingProduct.setpName(productRequestModel.getName());
		existingProduct.setpDescription(productRequestModel.getDescription());
		existingProduct.setpPrice(productRequestModel.getPrice());
		Product updatedProduct = productRepository.save(existingProduct);
		return convertToDTO(updatedProduct);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	private ProductResponseModel convertToDTO(Product product) {
		ProductResponseModel dto = new ProductResponseModel();
		dto.setProductId(product.getpId());
		dto.setProductName(product.getpName());
		dto.setProductDescription(product.getpDescription());
		dto.setProductPrice(product.getpPrice());
		return dto;
	}
}
