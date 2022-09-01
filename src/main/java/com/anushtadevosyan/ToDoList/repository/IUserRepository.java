package com.anushtadevosyan.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anushtadevosyan.ToDoList.entity.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {

	
	@Query("select c from todolist_users c where c.email = ?1 and c.password = ?2")
	public UserEntity checkIfUserWithEmailandPasswordExists(String email, String password);
	
	@Query("select c from todolist_users c where c.email = ?1")
	public UserEntity checkIfUserEmailExists(String email);
}
