package com.p1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDto {

	private Long id;

	private Long userId;

	private String productName;

	private Integer quantity;
	

	public OrderDto(Long userId, String productName, Integer quantity) {
		super();
		this.userId = userId;
		this.productName = productName;
		this.quantity = quantity;
	}


	
	
}