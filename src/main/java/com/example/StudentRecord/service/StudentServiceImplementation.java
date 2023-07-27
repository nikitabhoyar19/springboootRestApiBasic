package com.example.StudentRecord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentRecord.model.Student;
import com.example.StudentRecord.repository.StudentRepo;

@Service
public class StudentServiceImplementation implements StudentService{
	
	@Autowired
	private StudentRepo studentRepository;

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
    
	@Override
	public Student getDataById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
 }

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	
}
