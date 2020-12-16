package com.application.service;

import com.application.entity.User;
import com.application.model.UserDto;
import com.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vuhien96 on 16/12/2020 22:19
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto createUser(UserDto userDto){
        User user = new User();
        user.setFullName(userDto.getFullName());
        user.setAddress(userDto.getAddress());
        user.setPhone(userDto.getPhone());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        return userDto;
    }
}
