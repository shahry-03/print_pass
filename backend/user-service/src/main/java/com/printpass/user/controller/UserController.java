package com.printpass.user.controller;

import com.printpass.user.dto.UserRequest;
import com.printpass.user.entity.User;
import com.printpass.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody UserRequest request) {
        return userService.createUser(request);
    }
}