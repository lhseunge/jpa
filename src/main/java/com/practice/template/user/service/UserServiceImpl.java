package com.practice.template.user.service;

import com.practice.template.user.entity.QUser;
import com.practice.template.user.entity.User;
import com.practice.template.user.repository.UserRepository;
import com.practice.template.user.dto.UserResponse;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final JPAQueryFactory queryFactory;

    @Override
    public List<UserResponse> getUsers() {
        return userRepository.findAll().stream()
                .map(UserResponse::from)
                .toList();
    }

    @Override
    public UserResponse getUserById(Long id) {

        QUser qUser = QUser.user;
        return UserResponse.from(
                queryFactory.select(qUser)
                        .from(qUser)
                        .where(qUser.id.eq(id))
                        .fetchOne());


    }
}
