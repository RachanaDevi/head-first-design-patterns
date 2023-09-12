package com.design.patterns.course.creational.factory_method;

public class JsonMessage extends Message {

    @Override
    public String content() {
        return "{\"JSON]\":[]}";
    }
}
