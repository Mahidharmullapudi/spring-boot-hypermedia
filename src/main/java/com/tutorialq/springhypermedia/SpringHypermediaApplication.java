package com.tutorialq.springhypermedia;

import com.tutorialq.springhypermedia.domain.Author;
import com.tutorialq.springhypermedia.domain.Post;
import com.tutorialq.springhypermedia.repository.AuthorRepository;
import com.tutorialq.springhypermedia.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringHypermediaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHypermediaApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(AuthorRepository authorRepository, PostRepository postRepository) {
        return args -> {
            Author author = new Author("first", "lastname", "test.lastname@tutorialq.com");
            authorRepository.save(author);
            Post post = new Post("Angular", "Angular is a frontend javascript library",
                    new Date(), author);
            postRepository.save(post);

            Author author1 = new Author("first", "lastname", "test.lastname@tutorialq.com");
            authorRepository.save(author1);
            Post post1 = new Post("politics", "Angular is a frontend javascript library",
                    new Date(), author1);
            postRepository.save(post1);

            Author author2 = new Author("first", "lastname", "test.lastname@tutorialq.com");
            authorRepository.save(author2);
            Post post2 = new Post("java", "Angular is a frontend javascript library",
                    new Date(), author2);
            postRepository.save(post2);

            Author author3 = new Author("first", "lastname", "test.lastname@tutorialq.com");
            authorRepository.save(author3);
            Post post3 = new Post("cooking", "Angular is a frontend javascript library",
                    new Date(), author3);
            postRepository.save(post3);

            Author author4 = new Author("first", "lastname", "test.lastname@tutorialq.com");
            authorRepository.save(author4);
            Post post4 = new Post("C++", "Angular is a frontend javascript library",
                    new Date(), author4);
            postRepository.save(post4);

            Author author5 = new Author("first", "lastname", "test.lastname@tutorialq.com");
            authorRepository.save(author5);
            Post post5 = new Post("Nothing", "Angular is a frontend javascript library",
                    new Date(), author5);
            postRepository.save(post5);
        };
    }
}
