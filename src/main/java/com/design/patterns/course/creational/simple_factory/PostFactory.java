package com.design.patterns.course.creational.simple_factory;

public class PostFactory {

    // we will create simple factory
    public static Post createPost(String type) {
        return switch (type) {
            case "news" -> new NewsPost();
            case "blog" -> new BlogPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException("Post type is unknown");
        };
    }
}
