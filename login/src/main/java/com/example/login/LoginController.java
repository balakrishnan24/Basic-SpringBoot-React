package com.example.login;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class LoginController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public Login loginPathVariable(@PathVariable String username) {
		return new Login(String.format("Hello World, %s", username));
	}
	
}
