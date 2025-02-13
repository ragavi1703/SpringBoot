package com.example.springJDBCEx;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springJDBCEx.model.Student;
import com.example.springJDBCEx.service.StudentService;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringJdbcExApplication.class, args);
		
		Student s = context.getBean(Student.class);
		s.setName("Ragavi");
		s.setMarks(100);
		s.setRollNo(104);
		
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);
		
		List<Student> students=service.getStudents();
		System.out.println(students);
	}

}
