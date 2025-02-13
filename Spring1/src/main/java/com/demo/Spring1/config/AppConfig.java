package com.demo.Spring1.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.demo.Spring1.Alien;
import com.demo.Spring1.Computer;
import com.demo.Spring1.Desktop;
import com.demo.Spring1.Laptop;

@Configuration
@ComponentScan("com.demo.Spring1")
public class AppConfig {
	
	
//	@Bean
//	public Alien alien(@Qualifier("laptop")Computer com) {
//		Alien obj=new Alien();
//		obj.setAge(26);
//		obj.setCom(com);
//		//obj.setCom(desktop()); It will make tightly coupled, hence creating com obj as paramater in the method
//		return obj;
//		
//	}
//	
//	
//	//@Bean(name="comm")
//	@Bean
//	//@Scope("prototype")
//	public Desktop desktop() {
//		return new Desktop();
//		}
//	
//	
//	@Bean
//	public Laptop laptop() {
//		return new Laptop();
//		}
//	

}
