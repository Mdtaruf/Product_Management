package com.productManagement.model;

public class ProductResponseModel {
	private Long productId;
    private String productName;
    private String productDescription;
    private double productPrice;
	public  Long getProductId() {
		return productId;
	}
	public  void setProductId(Long productId) {
		this.productId = productId;
	}
	public  String getProductName() {
		return productName;
	}
	public  void setProductName(String productName) {
		this.productName = productName;
	}
	public  String getProductDescription() {
		return productDescription;
	}
	public  void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public  double getProductPrice() {
		return productPrice;
	}
	public  void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
    
    

}
