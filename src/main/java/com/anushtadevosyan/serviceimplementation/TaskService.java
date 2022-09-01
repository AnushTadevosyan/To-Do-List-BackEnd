package com.anushtadevosyan.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anushtadevosyan.ToDoList.bean.TaskBean;
import com.anushtadevosyan.ToDoList.entity.TaskEntity;
import com.anushtadevosyan.ToDoList.repository.ITaskRepository;
import com.anushtadevosyan.ToDoList.repository.IUserRepository;
import com.anushtadevosyan.ToDoList.responseDTO.TaskResponseDTO;
import com.anushtadevosyan.service.ITaskService;

@Service
public class TaskService implements ITaskService {

	@Autowired
	ITaskRepository taskReposity;

	
	public TaskResponseDTO addNewTask(TaskBean newTask) {
		
		TaskEntity responseTaskEntity = new TaskEntity();
		responseTaskEntity = saveTaskToDataBase(newTask);
		TaskResponseDTO taskResponseDTO = new TaskResponseDTO();
		taskResponseDTO.setCompleted(responseTaskEntity.isCompleted());
		taskResponseDTO.setDueDate(responseTaskEntity.getDueDate());
		taskResponseDTO.setPriority(responseTaskEntity.getIsPriority());
		taskResponseDTO.setTaskID(responseTaskEntity.getTaskID());
		taskResponseDTO.setTaskText(responseTaskEntity.getTaskText());
		taskResponseDTO.setUserID(responseTaskEntity.getUserID());
		return taskResponseDTO;
	}
	
	
	//------helper methods ----

	private TaskEntity saveTaskToDataBase(TaskBean task) {
		TaskEntity taskEntity = new TaskEntity();
		taskEntity.setCompleted(task.isCompleted());
		taskEntity.setDueDate(task.getDueDate());
		taskEntity.setIsPriority(task.isPriority());
		taskEntity.setTaskText(task.getTaskText());
		taskEntity.setUserID(task.getUserID());
		taskEntity = taskReposity.save(taskEntity);
		
		return taskEntity;
	}
}
