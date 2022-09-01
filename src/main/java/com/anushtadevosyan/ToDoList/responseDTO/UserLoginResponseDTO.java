package com.anushtadevosyan.ToDoList.responseDTO;

public class UserLoginResponseDTO {
	
	private boolean userExists;
	private Long userID;
	private String accessToken;
	private String errorMessage;
	public boolean isUserExists() {
		return userExists;
	}
	public void setUserExists(boolean userExists) {
		this.userExists = userExists;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "UserLoginResponseDTO [userExists=" + userExists + ", userID=" + userID + ", accessToken=" + accessToken
				+ ", errorMessage=" + errorMessage + "]";
	}
	public UserLoginResponseDTO(boolean userExists, Long userID, String accessToken, String errorMessage) {
		super();
		this.userExists = userExists;
		this.userID = userID;
		this.accessToken = accessToken;
		this.errorMessage = errorMessage;
	}
	public UserLoginResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
