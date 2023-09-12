package com.design.patterns.creational.simple_factory;

import java.time.LocalDateTime;

public abstract class Post {

    private Long id;

    private String title;

    private String content;

    private LocalDateTime createdOn;

    private LocalDateTime publishedOn;

    // give getters for all of them
    public Long id() {
        return id;
    }

    public String title() {
        return title;
    }

    public String content() {
        return content;
    }

    public LocalDateTime createdOn() {
        return createdOn;
    }

    public LocalDateTime publishedOn() {
        return publishedOn;
    }

    public void id(Long id) {
        this.id = id;
    }

    public void title(String title) {
        this.title = title;
    }

    public void content(String content) {
        this.content = content;
    }

    public void createdOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public void publishedOn(LocalDateTime publishedOn) {
        this.publishedOn = publishedOn;
    }


}