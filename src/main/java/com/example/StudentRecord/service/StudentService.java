package com.example.StudentRecord.service;

import java.util.List;

import com.example.StudentRecord.model.Student;

public interface StudentService {
	
	   public Student saveStudent(Student student);
	  
	   public List<Student> getAllStudent();
	   
	   public Student getDataById(Integer id);

}
