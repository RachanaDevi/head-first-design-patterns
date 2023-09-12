package com.design.patterns.course.creational.factory_method;

public abstract class Message {

    public abstract String content();

    public void addDefaultHeaders(){
        // adds some default headers
    }

    public void encrypt(){
        // encrypt the content
    }
}
