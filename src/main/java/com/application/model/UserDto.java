package com.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by vuhien96 on 16/12/2020 22:19
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDto {
    private int id;
    private String fullName;
    private String phone;
    private String address;
    private String email;
    private String password;
}
