package com.example.StudentRecord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class StudentRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRecordApplication.class, args);
		
		System.out.println("Hello, there!");
		
	}

}
