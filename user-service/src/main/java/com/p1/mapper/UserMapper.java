package com.p1.mapper;

import com.p1.dto.UserDto;
import com.p1.entity.User;

public class UserMapper {
	
	public static UserDto mapToUserDto(User user) {
		return new UserDto(
				user.getId(),
                user.getFastName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword()
                );
	}
	
	public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getFastName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getPassword()
        );
    }
}