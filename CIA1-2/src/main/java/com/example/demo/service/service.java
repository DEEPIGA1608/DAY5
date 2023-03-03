package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Family;
import com.example.demo.repository.repository;



@Service
public class service {
	@Autowired
	repository Repo;
	public Family saveDetails(Family e) {
		return Repo.save(e);
	}
	public Family updateDetails(Family e1) {
		return Repo.saveAndFlush(e1);
	}
	public void deleteDetails(int id) {
		Repo.deleteById(id);
	}
	public String add(Family m) {
		Repo.save(m);
		return "Added";
	}
	public List<Family> getDetails(){
		return Repo.findAll();
	}

	}

