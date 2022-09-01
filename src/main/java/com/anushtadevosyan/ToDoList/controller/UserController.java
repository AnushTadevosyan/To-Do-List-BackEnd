package com.anushtadevosyan.ToDoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anushtadevosyan.ToDoList.bean.UserBean;
import com.anushtadevosyan.ToDoList.bean.UserLoginBean;
import com.anushtadevosyan.ToDoList.entity.UserEntity;
import com.anushtadevosyan.ToDoList.responseDTO.UserLoginResponseDTO;
import com.anushtadevosyan.ToDoList.responseDTO.UserResponseDTO;
import com.anushtadevosyan.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	IUserService userservice;
	

	@RequestMapping(method = RequestMethod.POST, path = "/todolist/registerNewUser")
	public UserResponseDTO registerUser(@RequestBody UserBean newUser) {
		
		return userservice.registerUser(newUser);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/todolist/login")
	public UserLoginResponseDTO loginUser(@RequestBody UserLoginBean user) {
		
		return userservice.userLogin(user);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/todolist/getAllUsers")
	public List<UserEntity> getAllUsers(){
		
		return userservice.getAllUsers();
	}
	
	
 
}
