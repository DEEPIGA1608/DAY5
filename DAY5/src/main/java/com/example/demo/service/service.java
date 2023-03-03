package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Book;
import com.example.demo.repository.repository;



@Service
public class service {
	@Autowired
	repository Repo;
	public Book saveDetails(Book e) {
		return Repo.save(e);
	}
	public Book updateDetails(Book e1) {
		return Repo.saveAndFlush(e1);
	}
	public void deleteDetails(int id) {
		Repo.deleteById(id);
	}
	public List<Book> getDetails(){
		return Repo.findAll();
	}
}
