package com.anushtadevosyan.ToDoList.responseDTO;

public class UserResponseDTO {

	
	private String firstName;
	private String middleName;
	private String lastName;
	private String dob;
	private String email;
	private boolean error;
	private String errorMessage;
	private Long employeeID;
	private String password;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserResponseDTO [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", dob=" + dob + ", email=" + email + ", error=" + error + ", errorMessage=" + errorMessage
				+ ", employeeID=" + employeeID + ", password=" + password + "]";
	}
	public UserResponseDTO(String firstName, String middleName, String lastName, String dob, String email,
			boolean error, String errorMessage, Long employeeID, String password) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.error = error;
		this.errorMessage = errorMessage;
		this.employeeID = employeeID;
		this.password = password;
	}
	public UserResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
