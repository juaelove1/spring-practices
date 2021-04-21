package com.bitacademy.hellospring.controller;

public class UserVo {
	private String name;
	private String email;
	private String password;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserVo [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
}
