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


import com.example.demo.entity.entity;

import com.example.demo.service.service;



@RestController
public class controller {
	@Autowired
	service Service;
	@PostMapping("/addPatients")
	public entity addInfo(@RequestBody entity st) {
		return Service.saveDetails(st);
	}
	@GetMapping("Display")
	public List<entity> fetchDetails(){
		return Service.getDetails();
	}
	@PutMapping("/UpdatepatientDetails")
	public entity updateInfo(@RequestBody entity st1) {
		return Service.updateDetails(st1);
	}
	@DeleteMapping("/delete/{patient_id}")
	public String deleteInfo(@PathVariable("patient_id")int patient_id) {
		Service.deleteDetails(patient_id);
		return "Deleted details";
	}
	

	@GetMapping("/get")
	public List<entity> showDetails() {
		return Service.getDetails();

	}

	@PostMapping("/post")
	public String addDetails(@RequestBody entity m) {
		Service.add(m);
		return "Added product " + m.getPatientId();
	}

	//sorting
	@GetMapping("/product/{field}")
	public List<entity> getWithSort(@PathVariable String field) {
		return Service.getSorted(field);
	}

	// pagination
	@GetMapping("/product/{offset}/{pageSize}")
	public List<entity> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		return Service.getWithPagination(offset, pageSize);
	}

}
