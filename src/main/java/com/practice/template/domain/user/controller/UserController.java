package com.practice.template.domain.user.controller;

import com.practice.template.domain.user.service.UserService;
import com.practice.template.global.dto.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("users")
    public ApiResponse<?> getUsers() {
        return ApiResponse.success(userService.getUsers());
    }

    @GetMapping("users/{id}")
    public ApiResponse<?> getUser(@PathVariable("id") Long id) {
        return ApiResponse.success(userService.getUserById(id));
    }
}
