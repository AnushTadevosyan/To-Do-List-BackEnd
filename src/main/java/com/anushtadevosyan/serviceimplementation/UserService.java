package com.anushtadevosyan.serviceimplementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anushtadevosyan.ToDoList.bean.UserBean;
import com.anushtadevosyan.ToDoList.bean.UserLoginBean;
import com.anushtadevosyan.ToDoList.entity.UserEntity;
import com.anushtadevosyan.ToDoList.repository.IUserRepository;
import com.anushtadevosyan.ToDoList.responseDTO.UserLoginResponseDTO;
import com.anushtadevosyan.ToDoList.responseDTO.UserResponseDTO;
import com.anushtadevosyan.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepository;
	

	
	public UserResponseDTO registerUser(UserBean newUser) {
		
		
		//step 1: if user with such email exists, don't register
		//step 2: else, register
		UserResponseDTO userResponseDTO = new UserResponseDTO();
		UserEntity responseUserEntity = new UserEntity();
		responseUserEntity = userRepository.checkIfUserEmailExists(newUser.getEmail());
		if(responseUserEntity!=null) {
			userResponseDTO.setFirstName(newUser.getFirstName());
			userResponseDTO.setMiddleName(newUser.getMiddleName());
			userResponseDTO.setLastName(newUser.getLastName());
			userResponseDTO.setDob(newUser.getDob());
			userResponseDTO.setEmail(newUser.getEmail());
			userResponseDTO.setEmployeeID(responseUserEntity.getUserID());
			userResponseDTO.setError(true);
			userResponseDTO.setErrorMessage("User with " + newUser.getEmail() +" email already exists with userID " + responseUserEntity.getUserID());
			userResponseDTO.setPassword(newUser.getPassword());
		}else {
			responseUserEntity = saveUserToDataBase(newUser);
			userResponseDTO = populateUserResponseDTO(responseUserEntity);
		}
	
		return userResponseDTO;
	}
	
	public UserLoginResponseDTO userLogin(UserLoginBean user) {
		
		UserLoginResponseDTO userLoginResponseDTO = new UserLoginResponseDTO();
		//step 1: check to see if email & password exist
		UserEntity logginUser = new UserEntity();
		logginUser = userRepository.checkIfUserWithEmailandPasswordExists(user.getEmail(), user.getPassword());
		//if they exist, generate accessToken and return with ID
		if(logginUser!=null) {
			
			userLoginResponseDTO.setUserID(logginUser.getUserID());
			userLoginResponseDTO.setUserExists(true);
			userLoginResponseDTO.setErrorMessage("No Errors");
			String uuid = UUID.randomUUID().toString();
			userLoginResponseDTO.setAccessToken(uuid);
			
		}else{
			logginUser = userRepository.checkIfUserEmailExists(user.getEmail());
			//if dont exist, check if email exists
			if(logginUser!=null) {
				//if email exists, notify wrong password
				userLoginResponseDTO.setUserID(logginUser.getUserID());
				userLoginResponseDTO.setUserExists(true);
				userLoginResponseDTO.setErrorMessage("Wrong Password");
				userLoginResponseDTO.setAccessToken("");
			}else {
				//if doesn't exist, no user
				userLoginResponseDTO.setUserID(null);
				userLoginResponseDTO.setUserExists(false);
				userLoginResponseDTO.setErrorMessage("User doesn't exist");
				userLoginResponseDTO.setAccessToken("");
			}
			
		}		
	
		return userLoginResponseDTO;
		
	}
	
	
	public List<UserEntity> getAllUsers(){
		
		return userRepository.findAll();
	}
	
	
	
	//--------------- HELPER METHODS ----------------
	
	
	private UserEntity saveUserToDataBase(UserBean user) {
		
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName(user.getFirstName());
		userEntity.setMiddleName(user.getMiddleName());
		userEntity.setLastName(user.getLastName());
		userEntity.setDob(user.getDob());
		userEntity.setEmail(user.getEmail());
		userEntity.setPassword(user.getPassword());
		userEntity = userRepository.save(userEntity);
		
		return userEntity;
		
	}
	
	private UserResponseDTO populateUserResponseDTO(UserEntity responseUserEntity ) {
		
		UserResponseDTO userResponseDTO = new UserResponseDTO(responseUserEntity.getFirstName(), responseUserEntity.getMiddleName(),responseUserEntity.getLastName(), responseUserEntity.getDob(), responseUserEntity.getEmail(), false, "", responseUserEntity.getUserID(), responseUserEntity.getPassword());

		return userResponseDTO;
	}
}
