package com.design.patterns.course.creational.abstract_factory;

public class EC2Instance implements Instance{

    @Override
    public void start() {
        System.out.println("created ec2 instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("attached " + storage + " to ec2 instance");
    }

    @Override
    public void stop() {
        System.out.println("stopped ec2 instance");
    }

    @Override
    public String toString(){
        return "EC2Instance";
    }
}
