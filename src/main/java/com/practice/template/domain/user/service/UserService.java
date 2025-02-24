package com.practice.template.domain.user.service;

import com.practice.template.domain.user.dto.UserResponse;

import java.util.List;

public interface UserService {

    List<UserResponse> getUsers();

    UserResponse getUserById(Long id);
}
