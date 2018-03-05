package com.tutorialq.springhypermedia.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Author implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    @OneToMany(mappedBy = "author")
    private List<Post> posts;

    public Author(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }
}
