package com.practice.template.domain.post.service;

import com.practice.template.domain.post.dto.PostResponse;
import com.practice.template.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<PostResponse> getPosts() {
        return postRepository.findAll().stream()
                .map(PostResponse::from)
                .toList();
    }

    @Override
    public List<PostResponse> getPostByUserId(Long userId) {

        return postRepository.findByUserId(userId).stream()
                .map(PostResponse::from)
                .toList();
    }
}
