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

import com.example.demo.models.Student;
import com.example.demo.service.service;



@RestController
public class controller {
	@Autowired
	service Service;
	@PostMapping("/addInfo")
	public Student addInfo(@RequestBody Student st) {
		return Service.saveDetails(st);
	}
	@GetMapping("Display")
	public List<Student> fetchDetails(){
		return Service.getDetails();
	}
	@PutMapping("/UpdateInfo")
	public Student updateInfo(@RequestBody Student st1) {
		return Service.updateDetails(st1);
	}
	@DeleteMapping("/deleteInfo/{Id}")
	public String deleteInfo(@PathVariable("Id")int Id) {
		Service.deleteDetails(Id);
		return "Deleted details";
	}
	
}
