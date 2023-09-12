package com.design.patterns.course.creational.simple_factory;

public class ProductPost extends Post {

    private String imageUrl;

    private String name;


    public String imageUrl() {
        return imageUrl;
    }

    public void imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }
}
