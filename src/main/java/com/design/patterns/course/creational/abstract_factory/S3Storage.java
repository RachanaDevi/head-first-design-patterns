package com.design.patterns.course.creational.abstract_factory;

public class S3Storage implements Storage{

    @Override
    public String getId() {
        return "S3";
    }

    public S3Storage(int capacityInMB) {
        System.out.println("Allocated " + capacityInMB + " on S3");
    }

    @Override
    public String toString(){
        return "S3Storage";
    }
}
