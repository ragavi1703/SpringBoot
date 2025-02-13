package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.app.Service.LaptopService;
import com.example.app.model.Laptop;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringBootFirstApplication.class, args);
		
		
		LaptopService service=context.getBean(LaptopService.class);
		Laptop lap=context.getBean(Laptop.class);
		service.addLaptop(lap);
		
//		Alien al=context.getBean(Alien.class);
//		System.out.println(al.getAge());
//		al.code();
		
		
		}

}
