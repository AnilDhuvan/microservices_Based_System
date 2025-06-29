package com.p1.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.dto.OrderDto;
import com.p1.service.OrderService;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

	private final OrderService orderService;

	// Build Create Order REST API
	@PostMapping
	public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto orderDto) {
		OrderDto saveOrder = orderService.createOrder(orderDto);
		return new ResponseEntity<>(saveOrder, HttpStatus.CREATED);
	}

	// Build Get Order BY ID Rest ApI
	@GetMapping("/{id}")
	public ResponseEntity<OrderDto> getById(@PathVariable("id") Long id) {
		OrderDto orderByID = orderService.getOrderById(id);
		return ResponseEntity.ok(orderByID);
	}

	// Build Get All Order Rest ApI
	@GetMapping
	public ResponseEntity<List<OrderDto>> getAllOrder() {
		List<OrderDto> allOrder = orderService.getAllOrders();
		return new ResponseEntity<List<OrderDto>>(allOrder, HttpStatus.OK);
	}

	// Build Update Order Record ApI
	@PutMapping("/{id}")
	public ResponseEntity<OrderDto> update(@PathVariable("id") Long id, @RequestBody OrderDto updatedOrder) {
		OrderDto updateOrder = orderService.updateOrder(id, updatedOrder);
		return new ResponseEntity<OrderDto>(updateOrder, HttpStatus.OK);
	}

	// Build Delete Order Record ApI
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		orderService.deleteOrder(id);
		return ResponseEntity.ok(" your Order deleted successfully!.");
	}
}