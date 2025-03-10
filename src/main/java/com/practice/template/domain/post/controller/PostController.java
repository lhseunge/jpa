package com.practice.template.domain.post.controller;

import com.practice.template.domain.post.service.PostService;
import com.practice.template.global.dto.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public ApiResponse<?> getPosts() {
        return ApiResponse.success(postService.getPosts());
    }

    @GetMapping("users/{userId}")
    public ApiResponse<?> getPostsByUserId(@PathVariable("userId") Long userId) {
        return ApiResponse.success(postService.getPostByUserId(userId));
    }
}
