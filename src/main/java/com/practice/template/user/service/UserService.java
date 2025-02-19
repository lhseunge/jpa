package com.practice.template.user.service;

import com.practice.template.user.dto.UserResponse;

import java.util.List;

public interface UserService {

    List<UserResponse> getUsers();
}
