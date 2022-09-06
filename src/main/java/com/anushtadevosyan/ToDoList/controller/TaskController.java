package com.anushtadevosyan.ToDoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anushtadevosyan.ToDoList.bean.TaskBean;
import com.anushtadevosyan.ToDoList.bean.TaskIDBean;
import com.anushtadevosyan.ToDoList.bean.TaskIDandDueDate;
import com.anushtadevosyan.ToDoList.bean.UserIDForTaskBean;
import com.anushtadevosyan.ToDoList.entity.TaskEntity;
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
	
	//add task DONE
	
	//get all tasks of that user 
	//database returns entity. You have to convert it to responseDTO manually
	@RequestMapping(method=RequestMethod.POST, path = "/todolist/getAllTasksForUserGivenID")
	public List<TaskEntity> getAllTasksForThatUserGivenID(@RequestBody UserIDForTaskBean userID){
		return taskservice.getAllTasksForTheUserGivenID(userID.getUserID());
	}
	
	//mark task as completed
	@RequestMapping(method=RequestMethod.POST, path = "/todolist/markTaskAsCompletedGivenID")
	public TaskResponseDTO markTaskAsCompletedBasedOnTaskID(@RequestBody TaskIDBean taskIDBean) {
		return taskservice.markTaskAsCompleted(taskIDBean.getTaskID());
	}
	
	//add due date to task
	@RequestMapping(method=RequestMethod.POST, path = "/todolist/addDueDateToTask")
	public TaskResponseDTO addDueDateToTaskBasedOnTaskID(@RequestBody TaskIDandDueDate taskIDandDueDate) {
		
		return taskservice.addDueDateToTaskGivenTaskID(taskIDandDueDate.getTaskID(), taskIDandDueDate.getDueDate());
	}
	
	//mark task as priority
}
