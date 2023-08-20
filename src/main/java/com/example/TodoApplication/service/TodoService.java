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
	
	public Todo getToDoItemById(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public Todo store(Todo todo) {
		// TODO Auto-generated method stub
		return repo.save(todo);
	}
	
	public boolean saveOrUpdateToDoItem(Todo todo) {
		Todo updatedObj = repo.save(todo);
		
		if (getToDoItemById(updatedObj.getId()) != null) {
			return true;
		}
		
		return true;
	}

	public boolean deleteToDoItem(Integer id) {
		// TODO Auto-generated method stub
repo.deleteById(id);
		
		if (repo.findById(id).isEmpty()) {
			return true;
		}
		return false;
	}
}
