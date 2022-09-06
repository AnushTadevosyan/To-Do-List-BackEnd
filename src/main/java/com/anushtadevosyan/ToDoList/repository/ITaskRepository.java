package com.anushtadevosyan.ToDoList.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anushtadevosyan.ToDoList.entity.TaskEntity;
import com.anushtadevosyan.ToDoList.entity.UserEntity;
import com.anushtadevosyan.ToDoList.responseDTO.TaskResponseDTO;

public interface ITaskRepository extends JpaRepository<TaskEntity, Long> {
	
	
//	@Query("SELECT new com.anushtadevosyan.ToDoList.responseDTO.TaskResponseDTO (task.userID as userID) "
//			+ "FROM todolist_tasks as task WHERE task.userID = ?1")
	@Query("SELECT c FROM todolist_tasks c WHERE c.userID=?1")
	public List<TaskEntity> getAllTasksForTheUser(Long userID);
	
	
	@Query("SELECT c FROM todolist_tasks c WHERE c.taskID=?1")
	public TaskEntity getTaskfromDatabaseGivenTaskID(Long taskID);
		
		
	
}
