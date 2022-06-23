package com.rinfotek.usercurdoperation.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.rinfotek.onetomany.entity.Fee;

@Entity
@Table(name="User")
public class User {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="ID")
private Integer userId;//id same

@Column(name="First_Name")
private String firstName;
@Column(name="Last_Name")
private String lastName;
@Column(name="User_Type")
private String userType;
@Column(name="Start_Date")
private LocalDate startDate;

@OneToMany(targetEntity=Product.class,cascade=CascadeType.ALL)
@JoinColumn(name="uid_fk",referencedColumnName="id")
private List<Product> products;

public Integer getUserId() {
	return userId;
}
public void setUserId( Integer userId) {
	this.userId = userId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public LocalDate getStartDate() {
	return startDate;
}
public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
}

public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "UserId=" + getUserId() + ",FirstName=" + getFirstName() + ",LastName=" + getLastName() + ",userType=" + getUserType()
			+ ", startDate=" + getStartDate() +"Products="+getProducts();
}



}
