package com.hms.model;

public class LoginPage {
	private String userName;
	private String password;
	
	
	
	public LoginPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public LoginPage(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "LoginPage [userName=" + userName + ", password=" + password + "]";
	}
	
	
	

}
