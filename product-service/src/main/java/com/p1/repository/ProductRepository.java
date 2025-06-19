package com.p1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.p1.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
	
}
