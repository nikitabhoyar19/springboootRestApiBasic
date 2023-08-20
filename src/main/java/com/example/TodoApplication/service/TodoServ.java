package com.example.TodoApplication.service;

import java.util.List;

import com.example.TodoApplication.model.Todo;

public interface TodoServ {
	
      public List<Todo> getList();
      
      public Todo getToDoItemById(Integer id);
      
      public Todo store(Todo todo);
      
      public boolean deleteToDoItem(Integer id);
      
      public boolean saveOrUpdateToDoItem(Todo todo);
}
