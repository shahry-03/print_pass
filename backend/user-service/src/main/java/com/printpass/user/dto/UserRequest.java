package com.printpass.user.dto;

import com.printpass.user.enums.Role;
import lombok.Data;

@Data
public class UserRequest {
    private String name;
    private String email;
    private String password;
    private Role role;
}