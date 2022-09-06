package com.anushtadevosyan.ToDoList.bean;

public class TaskIDandDueDate {

	private Long taskID;
	private String dueDate;
	public Long getTaskID() {
		return taskID;
	}
	public void setTaskID(Long taskID) {
		this.taskID = taskID;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public TaskIDandDueDate(Long taskID, String dueDate) {
		super();
		this.taskID = taskID;
		this.dueDate = dueDate;
	}
	public TaskIDandDueDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TaskIDandDueDate [taskID=" + taskID + ", dueDate=" + dueDate + "]";
	}
	
	
}
