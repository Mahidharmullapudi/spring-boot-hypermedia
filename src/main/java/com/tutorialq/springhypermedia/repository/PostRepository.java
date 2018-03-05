package com.tutorialq.springhypermedia.repository;

import com.tutorialq.springhypermedia.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
