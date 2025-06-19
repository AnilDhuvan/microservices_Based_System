package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
