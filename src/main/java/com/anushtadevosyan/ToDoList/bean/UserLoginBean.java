package com.anushtadevosyan.ToDoList.bean;

public class UserLoginBean {
	
	private String email;
	private String password;
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
		return "UserLoginBean [email=" + email + ", password=" + password + "]";
	}
	public UserLoginBean(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public UserLoginBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
