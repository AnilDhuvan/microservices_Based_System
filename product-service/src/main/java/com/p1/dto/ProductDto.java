package com.p1.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDto {

	@JsonProperty("id")
	private String id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("price")
	private Double price;

	@JsonProperty("stock")
	private Integer stock;

	
	public ProductDto() {
	}
	
	

	public ProductDto(String name, String description, Double price, Integer stock) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}



	public ProductDto(String id, String name, String description, Double price, Integer stock) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "ProductDto{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", price=" + price
				+ ", stock=" + stock + '}';
	}

}
