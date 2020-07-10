package io.laidani.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/index")
	public String Greetings() {
		return "index";
	}
	
	@GetMapping("/delete")
	public String Delete() {
		return "Delete";
	}
	
	@GetMapping("/create")
	public String Create() {
		return "create";
	}
	
	@GetMapping("/login")
	public String goToLoginPage() {
		return "loginPage";
	}
	
	
	
}
