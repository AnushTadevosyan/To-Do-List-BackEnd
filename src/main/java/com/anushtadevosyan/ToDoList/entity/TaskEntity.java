package com.anushtadevosyan.ToDoList.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="todolist_tasks")
@Table(name="todolist_tasks")
public class TaskEntity implements Serializable{
	
	@Column(name="task_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long taskID;
	
	@Column(name="user_id")
	private Long userID;
	

	@Column(name="task_text")
	private String taskText;
	
	@Column(name="is_completed")
	private boolean completed;
	
	@Column(name="due_date")
	private String dueDate;
	
	@Column(name="is_priority")
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
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean getIsPriority() {
		return isPriority;
	}

	public void setIsPriority(boolean isPriority) {
		this.isPriority = isPriority;
	}

	@Override
	public String toString() {
		return "TaskEntity [taskID=" + taskID + ", userID=" + userID + ", taskText=" + taskText + ", completed="
				+ completed + ", dueDate=" + dueDate + ", isPriority=" + isPriority + "]";
	}

	public TaskEntity(Long taskID, Long userID, String taskText, boolean completed, String dueDate, boolean isPriority) {
		super();
		this.taskID = taskID;
		this.userID = userID;
		this.taskText = taskText;
		this.completed = completed;
		this.dueDate = dueDate;
		this.isPriority = isPriority;
	}

	public TaskEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
