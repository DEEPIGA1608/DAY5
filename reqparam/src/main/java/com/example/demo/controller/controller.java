package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@GetMapping("/home")
public String get(@RequestParam String name,@RequestParam String dept) {
	return "Hi"+name+"from"+dept; 
}
}
