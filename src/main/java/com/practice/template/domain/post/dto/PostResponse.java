package com.practice.template.domain.post.dto;

import com.practice.template.domain.post.entity.Post;
import com.practice.template.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PostResponse {

    private long id;
    private String title;
    private String content;
    private User user;

    public static PostResponse from(Post post) {
        return new PostResponse(post.getId(), post.getTitle(), post.getContent(), post.getUser());
    }

}
