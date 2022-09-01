package com.anushtadevosyan.service;

import java.util.List;

import com.anushtadevosyan.ToDoList.bean.UserBean;
import com.anushtadevosyan.ToDoList.bean.UserLoginBean;
import com.anushtadevosyan.ToDoList.entity.UserEntity;
import com.anushtadevosyan.ToDoList.responseDTO.UserLoginResponseDTO;
import com.anushtadevosyan.ToDoList.responseDTO.UserResponseDTO;

public interface IUserService {
	
	
	public UserResponseDTO registerUser(UserBean newUser);
	public List<UserEntity> getAllUsers();
	public UserLoginResponseDTO userLogin(UserLoginBean user);

}
