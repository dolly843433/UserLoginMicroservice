package com.user.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.login.entity.Model;
import com.user.login.jpa.Repository;
import com.user.login.jwt.JwtUtelis;
import com.user.login.security.UserDetail;
@CrossOrigin("http://localhost:4200")
@RestController
public class LoginController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtUtelis util;
	
	@PostMapping("/login")
	public String loginModel(@RequestBody Model model ) {
		try {
			Authentication auth=authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(model.getEmail_id(),model.getPassword()));
		
		  if(auth.isAuthenticated()) {
			  UserDetail details=new UserDetail(model);
			  String token =util.generateToken(details);
			  
			  return token;
		  }
		  return "User not Authenticated";
		}
		catch(Exception e) {
			return "User or Password does not Matched.";
		}

			
		}

	

}
