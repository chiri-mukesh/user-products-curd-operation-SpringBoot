package com.rinfotek.usercurdoperation.controller;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rinfotek.usercurdoperation.entity.Product;
import com.rinfotek.usercurdoperation.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
@Autowired
ProductService productService;

////Insert user record
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
//	//Fetch all user records
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();	
	}
	
////Fetch single user
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") int pId) {//pass variable pId
	return productService.getProductById(pId);
}
	//Update user record
	@PutMapping("/updateproduct")
	public ResponseEntity<String> updateProduct(@RequestBody Product product){
		try {
			productService.updateProduct(product);
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		catch(NoSuchElementException ex) {//NoSuchElementException
			//log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
	//Delete user record
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct(@RequestBody int id){//delete by id
		try {
			productService.deleteProductById(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		catch(RuntimeException ex) {//RuntimeException
			//log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
}
