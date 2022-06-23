package com.rinfotek.usercurdoperation.service;

import java.util.List;

import com.rinfotek.usercurdoperation.entity.Product;


public interface ProductService {
	Product addProduct(Product product);
	List<Product> getAllProducts();
	Product getProductById(int pId);
	void updateProduct(Product product);
	void deleteProductById(int pId);
	
}
