package com.example.TodoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.TodoApplication.model.Todo;
import com.example.TodoApplication.service.TodoServ;

@Controller
public class TodoController {
	
	@Autowired
	private TodoServ service;

	@RequestMapping("/he")
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String alldata(ModelMap model){
		List<Todo> todo = service.getList();
		model.addAttribute("todos", todo);
		return "data";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addData(@RequestBody Todo todo) {
		service.store(todo);
		return "Student added";
	}
}
