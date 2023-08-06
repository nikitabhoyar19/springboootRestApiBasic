package com.example.TodoApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TodoApplication.model.Todo;
import com.example.TodoApplication.repo.TodoRepo;

@Service
public class TodoService implements TodoServ{
    
	@Autowired
	private TodoRepo repo;
	
	@Override
	public List<Todo> getList() {
		return repo.findAll();
	}

	@Override
	public Todo store(Todo todo) {
		// TODO Auto-generated method stub
		return repo.save(todo);
	}
	
	
}
