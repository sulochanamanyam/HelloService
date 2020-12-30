package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.Customer;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello(String name) {
		return "Hello from Springboot "+name;
		
	}
	@PostMapping("/send")
	public String sendMessage(@RequestBody Customer customer) {
		return "Hello from Springboot "+customer.getfName();
		
	}
}
