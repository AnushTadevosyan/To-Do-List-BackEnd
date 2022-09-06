package com.anushtadevosyan.ToDoList.bean;

import java.util.Objects;

public class TaskIDBean {
	
	private Long taskID;

	public Long getTaskID() {
		return taskID;
	}

	public void setTaskID(Long taskID) {
		this.taskID = taskID;
	}

	@Override
	public String toString() {
		return "TaskIDBean [taskID=" + taskID + "]";
	}

	public TaskIDBean(Long taskID) {
		super();
		this.taskID = taskID;
	}

	public TaskIDBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
