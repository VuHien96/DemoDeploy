package com.application.controller;

import com.application.model.UserDto;
import com.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vuhien96 on 16/12/2020 22:30
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody UserDto userDto) {
        userDto = userService.createUser(userDto);
        return ResponseEntity.ok(userDto);
    }
}
