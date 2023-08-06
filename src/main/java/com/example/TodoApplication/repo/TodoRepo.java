package com.example.TodoApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TodoApplication.model.Todo;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Integer>{

	
}