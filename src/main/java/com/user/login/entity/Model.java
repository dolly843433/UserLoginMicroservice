package com.user.login.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Component
@Entity

@Table(name="Signup")
public class Model {
	
	@Id
	@Column(name="Email_id")
	private String Email_id;
	@Column(name="Full_name")
	private  String Full_name;
	@Column(name="Phone_number")
	private String phone_number;
	@Column(name="Adress")
	private String Adress;
	@Column(name="PIN")
	private String PIN;
	@Column(name="Password")
	private String Password;
	
	
	public Model() {
		super();
	}


	public Model(String email_id, String full_name, String phone_number, String adress, String pIN,
			String password) {
		super();
		Email_id = email_id;
		Full_name = full_name;
		this.phone_number = phone_number;
		Adress = adress;
		PIN = pIN;
		Password = password;
	}


	public String getEmail_id() {
		return Email_id;
	}


	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}


	public String getFull_name() {
		return Full_name;
	}


	public void setFull_name(String full_name) {
		Full_name = full_name;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public String getAdress() {
		return Adress;
	}


	public void setAdress(String adress) {
		Adress = adress;
	}


	public String getPIN() {
		return PIN;
	}


	public void setPIN(String pIN) {
		PIN = pIN;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "Model [Email_id=" + Email_id + ", Full_name=" + Full_name + ", phone_number=" + phone_number
				+ ", Adress=" + Adress + ", PIN=" + PIN + ", Password=" + Password + "]";
	}

	
	

	


}
