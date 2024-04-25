package com.CMS.Clinic.Management.System.Users;

import jakarta.persistence.Column;

public class Doctor extends User{
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
    private String phone;
	
	@Column(name="dept")
    private String dept;

	public Doctor(Long id, String username, String password, String email, String phone,
			String dept) {
		super(id, username, password, UserType.DOCTOR);
		this.email = email;
		this.phone = phone;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
