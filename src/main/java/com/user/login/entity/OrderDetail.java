package com.user.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Order_detail")
public class OrderDetail {
	

	@Id
	@Column(name="Order_id")
	private String Order_id;
	
	@Column(name="product_id")
	private String product_id;
	
	@Column(name="quantity")
	private long quantity;
	
	@Column(name="user_id")
	private String user_id;
	
	@Column(name="price")
	private long price;
	
	@Column(name="seller_id")
	private String seller_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name="land_mark")
	private String land_mark;
	
	@Column(name="pin")
	private String pin;
	
	@Column(name="full_address")
	private String full_address;
	
	
	@Column(name="date")
	private String date;
	
	

	public OrderDetail() {
		super();
	}




	














	public OrderDetail(String order_id, String product_id, long quantity, String user_id, long price, String seller_id,
			String name, String phone_number, String land_mark, String pin, String full_address, String date) {
		super();
		Order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.user_id = user_id;
		this.price = price;
		this.seller_id = seller_id;
		this.name = name;
		this.phone_number = phone_number;
		this.land_mark = land_mark;
		this.pin = pin;
		this.full_address = full_address;
		this.date = date;
	}



















	public String getOrder_id() {
		return Order_id;
	}




	public void setOrder_id(String order_id) {
		Order_id = order_id;
	}




	public String getProduct_id() {
		return product_id;
	}




	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}




	public long getQuantity() {
		return quantity;
	}




	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}




	public String getUser_id() {
		return user_id;
	}




	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}




	public long getPrice() {
		return price;
	}




	public void setPrice(long price) {
		this.price = price;
	}




	public String getSeller_id() {
		return seller_id;
	}




	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}



















	public String getName() {
		return name;
	}



















	public void setName(String name) {
		this.name = name;
	}



















	public String getPhone_number() {
		return phone_number;
	}



















	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}



















	public String getLand_mark() {
		return land_mark;
	}



















	public void setLand_mark(String land_mark) {
		this.land_mark = land_mark;
	}



















	public String getPin() {
		return pin;
	}



















	public void setPin(String pin) {
		this.pin = pin;
	}



















	public String getFull_address() {
		return full_address;
	}



















	public void setFull_address(String full_address) {
		this.full_address = full_address;
	}



















	public String getDate() {
		return date;
	}



















	public void setDate(String date) {
		this.date = date;
	}


     

	








	






	
}