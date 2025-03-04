package com.practice.template.core.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @PersistenceContext
    private EntityManager entityManager;

    @Bean
    public JPAQueryFactory getQueryFactory() {

        return new JPAQueryFactory(entityManager);
    }
}
