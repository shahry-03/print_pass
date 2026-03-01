package com.printpass.user.service;

import com.printpass.user.dto.UserRequest;
import com.printpass.user.entity.User;
import com.printpass.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(UserRequest request) {
        // Naya user banate waqt hum usko entity mein convert kar rahe hain
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword()) // Baad mein isko encrypt karenge
                .role(request.getRole())
                .walletBalance(BigDecimal.ZERO) // Naye user ka balance hamesha 0 hoga
                .build();

        // Database mein save karwa diya
        return userRepository.save(user);
    }
}