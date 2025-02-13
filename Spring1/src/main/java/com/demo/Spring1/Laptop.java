package com.demo.Spring1;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	public Laptop() {
		System.out.println("laptop obj is created");
	}
	
	@Override
	public void compile() {
		System.out.println("Compiled using laptop");
	}

}
