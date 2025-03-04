package com.practice.template.domain.post.repository;

import com.practice.template.domain.post.entity.Post;

import java.util.List;

public interface PostCustomRepository {
    List<Post> findByUserId(long user_id);

}
