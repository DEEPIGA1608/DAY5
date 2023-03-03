package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.models.Student;
import com.example.demo.repository.repository;



@Service
public class service {
	@Autowired
	repository Repo;
	public Student saveDetails(Student e) {
		return Repo.save(e);
	}
	public Student updateDetails(Student e1) {
		return Repo.saveAndFlush(e1);
	}
	public void deleteDetails(int id) {
		Repo.deleteById(id);
	}
	public String add(Student m) {
		Repo.save(m);
		return "Added";
	}
	public List<Student> getDetails(){
		return Repo.findAll();
	}
	
	public List<Student> getSorted(String field) {
		return Repo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<Student> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<Student> page =Repo.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}

}
