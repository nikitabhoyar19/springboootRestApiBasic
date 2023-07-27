package com.example.StudentRecord.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentRecord.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
