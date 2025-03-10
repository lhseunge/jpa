package com.practice.template.global.dto;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public class ApiResponse<T> {

    private HttpStatus status;
    private String message;
    private T data;

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(HttpStatus.OK, "success", data);
    }
}