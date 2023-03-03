package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient")
public class entity {
	@Id
	@Column(name="patientId")
	private int patientId;
	@Column(name="patient_name")
	private String patientname;
	@Column(name="age")
	private int age;
	@Column(name="disease")
	private String disease;
	
	

	public entity(int patientId, String patientname, int age, String disease) {
		super();
		this.patientId = patientId;
		this.patientname = patientname;
		this.age = age;
		this.disease = disease;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public entity() {
	}
	public String toString() {
		return "Patient_id="+patientId+"Patient_name="+patientname+"Age="+age+"Disease="+disease;
	}
	
}
