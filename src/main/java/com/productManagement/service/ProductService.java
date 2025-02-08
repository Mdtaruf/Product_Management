package com.productManagement.service;

import java.util.List;

import com.productManagement.model.ProductRequestModel;
import com.productManagement.model.ProductResponseModel;

public interface ProductService {

	List<ProductResponseModel> getAllProducts();

	ProductResponseModel getProductById(Long id);

	ProductResponseModel createProduct(ProductRequestModel product);

	ProductResponseModel updateProduct(Long id, ProductRequestModel product);

	void deleteProduct(Long id);

}
