package com.p1.service;

import java.util.List;

import com.p1.dto.UserDto;

public interface UserService {
	
		
		public UserDto createUser(UserDto user);
		
		public UserDto getUserByID(Long user);
		
		public UserDto updateUser(Long userId, UserDto updatedUser);
		
		public List<UserDto>  getAllUser();
		
		public void deleteUser(Long userId);

	}

