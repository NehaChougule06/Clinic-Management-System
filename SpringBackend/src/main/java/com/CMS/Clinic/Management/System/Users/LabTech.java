package com.CMS.Clinic.Management.System.Users;

import jakarta.persistence.Column;

public class LabTech extends User {

	@Column(name="email")
	private String email;
	
	@Column(name="phone")
    private String phone;

	public LabTech(Long id, String username, String password, String email, String phone) {
		super(id, username, password, UserType.LAB_TECHNICIAN);
		this.email = email;
		this.phone = phone;
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

}
