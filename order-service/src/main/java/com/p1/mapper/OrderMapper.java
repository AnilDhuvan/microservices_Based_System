package com.p1.mapper;

import com.p1.dto.OrderDto;
import com.p1.entity.Order;

public class OrderMapper {
		
		public static OrderDto mapToOrderDto(Order order) {
			return new OrderDto(
					order.getId(),
	                order.getUserId(),
	                order.getProductName(),
	                order.getQuantity()
	                );
		}
		
		public static Order mapToOrder(OrderDto orderDto){
	        return new Order(
	                orderDto.getId(),
	                orderDto.getUserId(),
	                orderDto.getProductName(),
	                orderDto.getQuantity()
	             
	        );
	    }
	}



