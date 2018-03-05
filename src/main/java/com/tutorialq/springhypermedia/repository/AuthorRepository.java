package com.tutorialq.springhypermedia.repository;

import com.tutorialq.springhypermedia.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
