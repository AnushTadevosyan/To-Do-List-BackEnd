package com.anushtadevosyan.service;

import com.anushtadevosyan.ToDoList.bean.TaskBean;
import com.anushtadevosyan.ToDoList.entity.TaskEntity;
import com.anushtadevosyan.ToDoList.responseDTO.TaskResponseDTO;

public interface ITaskService {

	public TaskResponseDTO addNewTask (TaskBean newTask);
}
