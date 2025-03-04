package com.practice.template.domain.post.repository;

import com.practice.template.domain.post.entity.Post;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.practice.template.domain.post.entity.QPost.post;

@Repository
@RequiredArgsConstructor
public class PostCustomRepositoryImpl implements PostCustomRepository {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Post> findByUserId(long user_id) {
        return queryFactory.selectFrom(post)
                .where(post.user.id.eq(user_id))
                .fetch();
    }
}
