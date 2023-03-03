package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Book;
import com.example.demo.service.service;

@RestController
public class Apicontroller {
	@Autowired
	service Service;
	@PostMapping("/addInfo")
	public Book addInfo(@RequestBody Book st) {
		return Service.saveDetails(st);
	}
	@GetMapping("Display")
	public List<Book> fetchDetails(){
		return Service.getDetails();
	}
	@PutMapping("/UpdateInfo")
	public Book updateInfo(@RequestBody Book st1) {
		return Service.updateDetails(st1);
	}
	@DeleteMapping("/deleteInfo/{Id}")
	public String deleteInfo(@PathVariable("Id")int Id) {
		Service.deleteDetails(Id);
		return "Deleted details";
	}
	
}
