package com.example.StudentRecord.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetdataController {

	
	@RequestMapping(value = "/index")
	   public String index() {
	      return "index";
	 }
	
	@RequestMapping("login")
	   public String logindata() {
	      return "login";
	 }
	
}
