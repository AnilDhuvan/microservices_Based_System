package com.p1.service;

import java.util.List;

import com.p1.dto.ProductDto;

public interface ProductService {

    public ProductDto createProduct(ProductDto dto);

    public ProductDto getProductById(String id);

    public List<ProductDto> getAllProducts();

    public ProductDto updateProduct(String id, ProductDto dto);

    public void deleteProduct(String id);
}
