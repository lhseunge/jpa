package com.practice.template.domain.post.service;

import com.practice.template.domain.post.dto.PostResponse;

import java.util.List;

public interface PostService {

    List<PostResponse> getPosts();
    List<PostResponse> getPostByUserId(Long userId);
}
