package com.rinfotek.usercurdoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rinfotek.usercurdoperation.entity.Product;
import com.rinfotek.usercurdoperation.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repository;

//	@Override
	public Product addProduct(Product product) {
		return repository.save(product);
	}
//	@Override
	public List<Product> getAllProducts() {
		return repository.findAll();
	}

//	@Override
	public Product getProductById(int pId) {
		return repository.findById(pId).get();
	}

	
//	@Override
	public void updateProduct(Product product) {
		// check if the user with the passed id exists or not
		Product productDB = repository.findById(product.getPId()).orElseThrow();
		// If user exists then updated
		repository.save(product);
	}

//	@Override
	public void deleteProductById(int pId) {
		try {
			repository.deleteById(pId);
		} catch (DataAccessException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}


}
