package com.example.StudentRecord.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentRecord.model.Student;
import com.example.StudentRecord.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/hello1")
	public String hello() {
		return "hello1";
	}
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
		return student.getName() + " name added";
	}

	@GetMapping("/all")
	public List<Student> get(){
		return studentService.getAllStudent();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable("id") Integer id) {
		return studentService.getDataById(id);
	}
	
}
