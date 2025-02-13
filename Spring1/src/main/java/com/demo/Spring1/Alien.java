package com.demo.Spring1;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Alien {
	
	@Value("21")
	private int age;
	
	@Autowired
	//@Qualifier("laptop")
	private Computer com;
	
	public Alien() {
		System.out.println("Alien Object is created");
	}
	
//	@ConstructorProperties({"age","lap"})
//	public Alien(int age, Computer com) {
//		super();
//		this.age = age;
//		this.com = com;
//	}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		//System.out.println("setter is called");
		this.age = age;
	}
	
	

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void code() {
		System.out.println("coding");
		com.compile();
	}

}
