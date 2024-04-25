package com.CMS.Clinic.Management.System.Users;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="patient")
public class Patient extends User {

	@Column(name="email")
	private String email;
	
	@Column(name="phone")
    private String phone;
	
	@Column(name="age")
    private int age;
	
	@Column(name="bloodgroup")
    private String bloodGroup;
	
	public Patient(Long id, String name, String password, String email, String phone, int age, String bloodGroup) {
		super(id,name,password,UserType.PATIENT);
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.bloodGroup = bloodGroup;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}