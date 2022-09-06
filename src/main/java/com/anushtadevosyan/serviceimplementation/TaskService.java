package com.anushtadevosyan.serviceimplementation;

import java.util.List;

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
		return populateTaskResponseFromTaskEntity(responseTaskEntity);

	}
	
	public TaskResponseDTO markTaskAsCompleted(Long taskID) {
		//step 1: get the task from database based on ID
		TaskEntity taskGivenIDFromDatabase = taskReposity.getTaskfromDatabaseGivenTaskID(taskID);
		//step 2: change the status of the task and save it to DB
		taskGivenIDFromDatabase.setCompleted(true);
		taskGivenIDFromDatabase = taskReposity.save(taskGivenIDFromDatabase);
		return populateTaskResponseFromTaskEntity(taskGivenIDFromDatabase);
		
	}
	
	public TaskResponseDTO addDueDateToTaskGivenTaskID(Long taskID, String dueDate) {
		TaskEntity taskGivenIDFromDatabase = taskReposity.getTaskfromDatabaseGivenTaskID(taskID);
		taskGivenIDFromDatabase.setDueDate(dueDate);
		taskGivenIDFromDatabase = taskReposity.save(taskGivenIDFromDatabase);
		return populateTaskResponseFromTaskEntity(taskGivenIDFromDatabase);
	}
	
	
	public TaskResponseDTO markTaskAsPriority(Long taskID) {
		TaskEntity taskGivenIDFromDatabase = taskReposity.getTaskfromDatabaseGivenTaskID(taskID);
		taskGivenIDFromDatabase.setIsPriority(true);;
		taskGivenIDFromDatabase = taskReposity.save(taskGivenIDFromDatabase);
		return populateTaskResponseFromTaskEntity(taskGivenIDFromDatabase);
		
	}
	
	//---------------------------HELPER METHODS -----------------------

	private TaskResponseDTO populateTaskResponseFromTaskEntity(TaskEntity responseTaskEntity) {
		TaskResponseDTO taskResponseDTO = new TaskResponseDTO();
		taskResponseDTO.setCompleted(responseTaskEntity.isCompleted());
		taskResponseDTO.setDueDate(responseTaskEntity.getDueDate());
		taskResponseDTO.setPriority(responseTaskEntity.getIsPriority());
		taskResponseDTO.setTaskID(responseTaskEntity.getTaskID());
		taskResponseDTO.setTaskText(responseTaskEntity.getTaskText());
		taskResponseDTO.setUserID(responseTaskEntity.getUserID());
		return taskResponseDTO;
		
	}
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
	
	public List<TaskEntity> getAllTasksForTheUserGivenID(Long userID){
		
		return taskReposity.getAllTasksForTheUser(userID);
	}
}
