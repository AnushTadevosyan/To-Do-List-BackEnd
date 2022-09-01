package com.anushtadevosyan.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anushtadevosyan.ToDoList.entity.TaskEntity;
import com.anushtadevosyan.ToDoList.entity.UserEntity;

public interface ITaskRepository extends JpaRepository<TaskEntity, Long> {

}
