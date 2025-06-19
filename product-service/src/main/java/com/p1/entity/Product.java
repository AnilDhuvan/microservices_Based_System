package com.p1.entity;


import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Document(collection = "products")
public class Product {
	
    @Id
    private String id;
  
    private String name;
    
    private String description;
   
    private Double price;
    
    private Integer stock;
    

    @CreatedDate
	private LocalDateTime createDate;
    
    @LastModifiedDate
	private LocalDateTime updateDate;
    
    
    

	public Product() {
		super();
	}
	
	

	public Product(String id, String name, String description, Double price, Integer stock) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}



	public Product(String name, String description, Double price, Integer stock) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}



	public Product(String id, String name, String description, Double price, Integer stock, LocalDateTime createDate,
			LocalDateTime updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.createDate = createDate;
		this.updateDate = updateDate;
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

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
       

}



