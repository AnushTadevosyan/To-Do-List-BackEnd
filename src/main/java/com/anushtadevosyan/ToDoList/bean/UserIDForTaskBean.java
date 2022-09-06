package com.anushtadevosyan.ToDoList.bean;

public class UserIDForTaskBean {
	
	private Long userID;

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "UserIDForTaskBean [userID=" + userID + "]";
	}

	public UserIDForTaskBean(Long userID) {
		super();
		this.userID = userID;
	}

	public UserIDForTaskBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
