package com.user.login.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.user.login.entity.OrderDetail;
import com.user.login.generated.idGenerator;
import com.user.login.jpa.OrderRepository;
import com.user.login.jwt.JwtUtelis;

@RestController
@CrossOrigin("http://localhost:4200")
public class OrderController {
	
	@Autowired
	OrderRepository orderrepository;
	
	@Autowired
	idGenerator idgen;
	
	@Autowired
	JwtUtelis utils;
	
	@PostMapping("/addproduct/{token}")
	public String insertorder(@RequestBody OrderDetail orderdetail,@PathVariable("token") String token) {
		
		LocalDate date=LocalDate.now();
		
		orderdetail.setOrder_id(idgen.orderidgenerator());
		orderdetail.setUser_id(utils.extractUsername(token));
		orderdetail.setDate(date.toString());
		
		 orderrepository.save(orderdetail);
			return"save order detail";
		}
	
	@GetMapping("/getAll/{token}")
	public List<OrderDetail> getAllById(@PathVariable("token") String token) {
	 
		return orderrepository.getAllByUser(utils.extractUsername(token));
	
	}
	
	
}