package com.tutorialq.springhypermedia.repository;

import com.tutorialq.springhypermedia.domain.Post;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
    List<Post> findByTitleContaining(@Param("title") String title);
}
