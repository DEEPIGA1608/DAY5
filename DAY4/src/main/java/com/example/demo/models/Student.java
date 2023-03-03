package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Day5")
public class Student {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="studentname")
	private String studentname;
	@Column(name="departmentname")
	private String departmentname;
	@Column(name="mailid")
	private String mailid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public Student(int id, String studentname, String departmentname, String mailid) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.departmentname = departmentname;
		this.mailid = mailid;
	}
	public Student() {
		
	}
	
}
