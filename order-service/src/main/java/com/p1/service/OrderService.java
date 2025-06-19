package com.p1.service;

import java.util.List;

import com.p1.dto.OrderDto;
import com.p1.entity.Order;

public interface OrderService {
	
   public OrderDto createOrder(OrderDto orderDto);
    
   public  List<OrderDto> getAllOrders();
    
    public OrderDto getOrderById(Long id);
    
    public OrderDto updateOrder(Long id, OrderDto orderDto);
    
    public void deleteOrder(Long id);
    
   
}
