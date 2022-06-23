package com.rinfotek.usercurdoperation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer pId;

private String productName;
private int qty;
private int price;
public Integer getPId() {
	return pId;
}
public void setPId( Integer pId) {
	this.pId = pId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "pId=" + getPId() + ", productName=" + getProductName() + ", qty=" + getQty() + ", price=" + getPrice() ;
}


}
