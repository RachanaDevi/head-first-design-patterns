package com.design.patterns.creational.simple_factory;

public class BlogPost extends Post{

    private String author;

    private String[] tags;

    public String author() {
        return author;
    }

    public void author(String author) {
        this.author = author;
    }

    public String[] tags() {
        return tags;
    }

    public void tags(String[] tags) {
        this.tags = tags;
    }

}
