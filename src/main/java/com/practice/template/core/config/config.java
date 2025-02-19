package com.practice.template.core.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class config {

    private final EntityManager entityManager;

    @Bean
    public JPAQueryFactory getQueryFactory() {

        return new JPAQueryFactory(entityManager);
    }
}
