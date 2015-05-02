package com.walkin.testProject.model;

public class User {
	String userName;
	String pass;
	String role;
	
	public User(String userName, String pass, String role) {
		super();
		this.userName = userName;
		this.pass = pass;
		this.role = role;
	}
	
	public User() {
		
	}
	

	public User(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
