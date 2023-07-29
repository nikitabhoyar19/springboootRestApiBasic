package com.example.LoginJsp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LoginJsp.AuthenticationService;

@Controller
public class LoginController {
	
	@Autowired
	private AuthenticationService auth;
	
	@RequestMapping("login")
	public String sayName(@RequestParam String name, ModelMap model) {
		model.put("name", name);	
		return "hello-jsp";
	}
	
	@RequestMapping(value ="logins", method = RequestMethod.GET)
	public String goToLogin() {
		return "hello-jsp";
	}
	
	@RequestMapping(value ="logins", method = RequestMethod.POST)
	public String goWelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		/*
		 * model.put("name", name); model.put("password", password);
		 */
		if(auth.authenticate(name, password)) {
			model.put("name", name);
			model.put("password", password);
			
			return "welcome";
		}
		model.put("errorMsg", "Invalid Credentials");
		return "hello-jsp";
	}
	
	@RequestMapping(value="h")
	@ResponseBody
    public String hello1() {
   	 return "hello";
    }
}
