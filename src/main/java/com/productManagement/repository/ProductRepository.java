package com.productManagement.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productManagement.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	Optional<Product> findById(Long id);

}
