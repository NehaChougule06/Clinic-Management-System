package com.CMS.Clinic.Management.System.Users;


public class Admin extends User {

	public Admin(Long id, String username, String password) {
		super(id, username, password, UserType.ADMIN);
	}

}
