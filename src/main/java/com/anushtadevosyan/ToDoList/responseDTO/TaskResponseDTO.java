package com.anushtadevosyan.ToDoList.responseDTO;

public class TaskResponseDTO {
	
	private Long taskID;
	private Long userID;
	private String taskText;
	private boolean isCompleted;
	private String dueDate;
	private boolean isPriority;
	public Long getTaskID() {
		return taskID;
	}
	public void setTaskID(Long taskID) {
		this.taskID = taskID;
	}
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
		return "TaskResponseDTO [taskID=" + taskID + ", userID=" + userID + ", taskText=" + taskText + ", isCompleted="
				+ isCompleted + ", dueDate=" + dueDate + ", isPriority=" + isPriority + "]";
	}
	public TaskResponseDTO(Long taskID, Long userID, String taskText, boolean isCompleted, String dueDate,
			boolean isPriority) {
		super();
		this.taskID = taskID;
		this.userID = userID;
		this.taskText = taskText;
		this.isCompleted = isCompleted;
		this.dueDate = dueDate;
		this.isPriority = isPriority;
	}
	public TaskResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
