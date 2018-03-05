package com.tutorialq.springhypermedia.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String body;
    private Date publishedDate;
    @ManyToOne
    private Author author;

    public Post(String title, String body, Date publishedDate, Author author) {
        this.title = title;
        this.body = body;
        this.publishedDate = publishedDate;
        this.author = author;
    }
}
