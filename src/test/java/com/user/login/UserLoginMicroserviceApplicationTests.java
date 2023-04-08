package com.user.login;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.user.login.jwt.JwtUtelis;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
@SpringBootTest
class UserLoginMicroserviceApplicationTests {
	
	@Autowired
	JwtUtelis utils;

	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void greetingShouldReturnDefaultMessage() {
		
		String jsonBody="{\"email_id\":\"dolly@gmail.com\",\"password\":\"123\"}";
		 String status=   given()
		         .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		         .body(jsonBody)
		         .when()
		         .post("http://localhost:8009/login").asString();
		 
		 String actual=utils.extractUsername(status);
		  assertEquals(actual, "dolly@gmail.com");
	}
	
	@Test
	public void addproducttest(){
		
		String jsonbody="{\"email_id\":\"dolly@gmail.com\",\"password\":\"123\"}";
		 String token=   given()
		         .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		         .body(jsonbody)
		         .when()
		         .post("http://localhost:8009/login").asString();
		
		String jsonBody="{\"product_id\":\"ty235667\",\"quantity\":\"13\",\"price\":\"245\",\"seller_id\":\"xyz@gmail.com\",\"name\":\"rani\",\"phone_number\":\"1345667\",\"land_mark\":\"banglore\",\"pin\":\"123\",\"full_address\":\"Nagavara Banglore\"}";
		 String status=   given()
		         .header("Authorization","Bearer "+ token).contentType(ContentType.JSON).accept(ContentType.JSON)
		         .body(jsonBody)
		         .when()
		         .post("http://localhost:8009/addproduct/"+token).asString();
		 
		  assertEquals(status, "save order detail");
	
		
	}

	@Test
	public void viewproduttest() {
		String jsonbody="{\"email_id\":\"dolly@gmail.com\",\"password\":\"123\"}";
		 String token=   given()
		         .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		         .body(jsonbody)
		         .when()
		         .post("http://localhost:8009/login").asString();
		
		 String status=   given()
		         .header("Authorization","Bearer "+ token).contentType(ContentType.JSON).accept(ContentType.JSON)
		         .when()
		         .get("http://localhost:8009/getAll/"+token)
		         .then()
		         .assertThat().statusCode(200)
		         .extract().response().asString();
		 
	}
	
}
