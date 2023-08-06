package com.example.TodoApplication.service;

import java.util.List;

import com.example.TodoApplication.model.Todo;

public interface TodoServ {
	
      public List<Todo> getList();
      
      public Todo store(Todo todo);
}
