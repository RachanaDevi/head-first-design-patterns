package com.design.patterns.creational.simple_factory;

public class Client {

    public static void main(String[] args) {
        Post post = PostFactory.createPost("news");
        System.out.println(post);
    }


}
