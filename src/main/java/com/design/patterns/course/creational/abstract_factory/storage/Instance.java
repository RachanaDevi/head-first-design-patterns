package com.design.patterns.course.creational.abstract_factory.storage;

public interface Instance {

    enum Capacity {micro, small, large};

    void start();

    void attachStorage(Storage storage);

    void stop();
}
