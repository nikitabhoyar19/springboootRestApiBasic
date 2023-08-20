package com.example.TodoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.TodoApplication.model.Todo;
import com.example.TodoApplication.service.TodoServ;

import ch.qos.logback.core.model.Model;
import jakarta.validation.Valid;

@Controller
public class TodoController {
	
	@Autowired
	private TodoServ service;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "welcome hii";
	}
	
	@RequestMapping("/welcome")
	public String wel() {
		return "welcome";
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String alldata(ModelMap model){
		List<Todo> todo = service.getList();
		//model.addAttribute("todos", todo);
		model.addAttribute("list", service.getList());
		return "data";
	}
	
	@GetMapping("/add")
	public String addDataOnForm(ModelMap model) {
		model.addAttribute("todo", new Todo());
		return "addData";
	}
	
	@PostMapping("/saveTodo")
	public String saveDataOnForm(@Valid Todo todo) {
		if(service.saveOrUpdateToDoItem(todo)) {
			return "redirect:/all";
		}
		return "redirect:all";
	}
	
	@GetMapping("/editToDoItem/{id}")
	public String editToDoItem(@PathVariable Integer id, ModelMap model) {
		model.addAttribute("todo", service.getToDoItemById(id));
		return "Edit";
	}

	@PostMapping("/editSaveToDoItem")
	public String editSaveToDoItem(@Valid Todo todo, RedirectAttributes redirectAttributes) {
		if(service.saveOrUpdateToDoItem(todo)) {
			redirectAttributes.addFlashAttribute("message", "Edit Success");
			return "redirect:/all";
		}
		
		redirectAttributes.addFlashAttribute("message", "Edit Failure");
		return "redirect://editToDoItem/" + todo.getId();
	}
	
//	@RequestMapping(value = "add", method = RequestMethod.POST)
//	@ResponseBody
//	public String addData(@RequestBody Todo todo) {
//		service.store(todo);
//		return "student added";
//	}
	
	@GetMapping("/deleteToDoItem/{id}")
	public String deleteToDoItem(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
		if (service.deleteToDoItem(id)) {
			redirectAttributes.addFlashAttribute("message", "Delete Success");
			return "redirect:/all";
		}
		
		redirectAttributes.addFlashAttribute("message", "Delete Failure");
		return "redirect:/all";
	}
}
