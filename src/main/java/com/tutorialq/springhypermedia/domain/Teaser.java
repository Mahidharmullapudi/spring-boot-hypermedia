package com.tutorialq.springhypermedia.domain;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "teaser", types = {Post.class})
public interface Teaser {
    String getTitle();

    String getBody();
}
