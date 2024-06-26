package com.jwt.springBoot.JWTEx.repository;

import com.jwt.springBoot.JWTEx.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {
}
