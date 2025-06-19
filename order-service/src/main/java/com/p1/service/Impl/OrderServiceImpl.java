package com.p1.service.Impl;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.p1.dto.OrderDto;
import com.p1.dto.UserDto;
import com.p1.entity.Order;
import com.p1.exception.ResourceNotFoundException;
import com.p1.mapper.OrderMapper;
import com.p1.repository.OrderRepository;
import com.p1.service.OrderService;
import com.p1.service.UserClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepo;
	private final UserClient userClient;

	public OrderDto createOrder(OrderDto orderDto) {
		// validate user exist or not
		UserDto user = userClient.getUserById(orderDto.getUserId());

		if (user == null) {
			throw new ResourceNotFoundException("Order not found with id: " + orderDto.getUserId());
		}

		Order order = OrderMapper.mapToOrder(orderDto);
		Order saveOrder = orderRepo.save(order);

		return OrderMapper.mapToOrderDto(saveOrder);
	}

	public OrderDto getOrderById(Long id) {
		Order order = orderRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Order is not exists with given id : " + id));
		return OrderMapper.mapToOrderDto(order);

	}

	public List<OrderDto> getAllOrders() {

		List<Order> orders = orderRepo.findAll();
		return orders.stream().map((order) -> OrderMapper.mapToOrderDto(order)).collect(Collectors.toList());

	}

	public OrderDto updateOrder(Long id, OrderDto uptOrder) {

		Order order = orderRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("order is not exists with given id :" + id));

		order.setUserId(uptOrder.getUserId());
		order.setProductName(uptOrder.getProductName());
		order.setQuantity(uptOrder.getQuantity());

		Order updateOrder = orderRepo.save(order);

		return OrderMapper.mapToOrderDto(updateOrder);
	}

	public void deleteOrder(Long id) {
		orderRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Order is not exists with given id: " + id));

		orderRepo.deleteById(id);
	}
}
