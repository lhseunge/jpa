package com.practice.template.domain.post.controller;

import com.practice.template.domain.post.dto.PostResponse;
import com.practice.template.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public List<PostResponse> getPosts() {
        return postService.getPosts();
    }

    @GetMapping("users/{userId}")
    public List<PostResponse> getPostsByUserId(@PathVariable("userId") Long userId) {
        return postService.getPostByUserId(userId);
    }
}
