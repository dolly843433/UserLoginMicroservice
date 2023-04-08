package com.user.login.generated;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class idGenerator {

public String orderidgenerator(){
		
		Random random=new Random();
		String a="";
		
		for(int i=0;i<15;i++) {
			a=a+random.nextInt(10);
		}
		
		return "O"+a;
	}
}
