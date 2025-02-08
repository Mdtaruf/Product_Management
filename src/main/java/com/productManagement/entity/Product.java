package com.productManagement.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pId;
	
	
	private String pName;
	
	private String pDescription;
	
	private Double pPrice;

	

	public Product() {
		super();
		
	}

	public  Long getpId() {
		return pId;
	}

	public  void setpId(Long pId) {
		this.pId = pId;
	}

	public  String getpName() {
		return pName;
	}

	public  void setpName(String pName) {
		this.pName = pName;
	}

	public  String getpDescription() {
		return pDescription;
	}

	public  void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public  Double getpPrice() {
		return pPrice;
	}

	public  void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}
	
	

}
