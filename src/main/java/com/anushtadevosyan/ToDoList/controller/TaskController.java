package com.anushtadevosyan.ToDoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anushtadevosyan.ToDoList.bean.TaskBean;
import com.anushtadevosyan.ToDoList.responseDTO.TaskResponseDTO;
import com.anushtadevosyan.service.ITaskService;

@RestController
public class TaskController {

	@Autowired
	ITaskService taskservice;
	
	@RequestMapping(method=RequestMethod.POST, path = "/todolist/addNewTask")
	public TaskResponseDTO addNewTask(@RequestBody TaskBean newTask) {
		return taskservice.addNewTask(newTask);
	}
	
	//add task
	
	//get all tasks of that user 
	
	//mark task as completed
	
	//add due date to task
	
	//mark task as priority
}
