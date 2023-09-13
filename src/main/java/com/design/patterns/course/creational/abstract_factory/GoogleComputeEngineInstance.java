package com.design.patterns.course.creational.abstract_factory;

public class GoogleComputeEngineInstance implements Instance{

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Allocated " + capacity + " on Google Compute Engine");
    }

    @Override
    public void start() {
        System.out.println("created google compute engine instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("attached " + storage + " to google compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("stopped google compute engine instance");
    }

    @Override
    public String toString(){
        return "GoogleComputeEngineInstance";
    }
}
