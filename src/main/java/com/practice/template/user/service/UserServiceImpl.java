package com.practice.template.user.service;

import com.practice.template.user.entity.QUser;
import com.practice.template.user.entity.User;
import com.practice.template.user.repository.UserRepository;
import com.practice.template.user.dto.UserResponse;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.practice.template.user.entity.QUser.user;

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

        // select절 Entity와 from절 Entity가 동일할 경우 축약 가능
        // select(Entity).from(Entity) -> selectFrom(Entity)
        User userInfo = queryFactory.selectFrom(user)
                .where(user.id.eq(id))
                .fetchOne();

        if (userInfo == null) {
            throw new RuntimeException("user not found");
        }

        return UserResponse.from(userInfo);


    }
}
