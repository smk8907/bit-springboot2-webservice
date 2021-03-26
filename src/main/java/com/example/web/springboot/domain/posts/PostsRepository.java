package com.example.web.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//DAO역할을 한다
public interface PostsRepository extends JpaRepository<Posts, Long> {
//jpa에 crud 메서드가 다 들어있음
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

}
