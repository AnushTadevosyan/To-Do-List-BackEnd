package com.anushtadevosyan.ToDoList.bean;

public class TaskBean {


	private Long userID;
	private String taskText;
	private boolean isCompleted;
	private String dueDate;
	private boolean isPriority;

	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public String getTaskText() {
		return taskText;
	}
	public void setTaskText(String taskText) {
		this.taskText = taskText;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isPriority() {
		return isPriority;
	}
	public void setPriority(boolean isPriority) {
		this.isPriority = isPriority;
	}
	@Override
	public String toString() {
		return "userID=" + userID + ", taskText=" + taskText + ", isCompleted="
				+ isCompleted + ", dueDate=" + dueDate + ", isPriority=" + isPriority + "]";
	}
	public TaskBean(Long userID, String taskText, boolean isCompleted, String dueDate,
			boolean isPriority) {
		super();
		this.userID = userID;
		this.taskText = taskText;
		this.isCompleted = isCompleted;
		this.dueDate = dueDate;
		this.isPriority = isPriority;
	}
	public TaskBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
