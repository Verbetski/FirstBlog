package com.lessons.goshadudar.springboot.blog.blog.repo;

import com.lessons.goshadudar.springboot.blog.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
