package com.anushtadevosyan.service;

import java.util.List;

import com.anushtadevosyan.ToDoList.bean.TaskBean;
import com.anushtadevosyan.ToDoList.entity.TaskEntity;
import com.anushtadevosyan.ToDoList.responseDTO.TaskResponseDTO;

public interface ITaskService {

	public TaskResponseDTO addNewTask (TaskBean newTask);
	
	public List<TaskEntity> getAllTasksForTheUserGivenID(Long userID);
	
	public TaskResponseDTO markTaskAsCompleted(Long taskID);
	
	public TaskResponseDTO addDueDateToTaskGivenTaskID(Long taskID, String dueDate);
}
