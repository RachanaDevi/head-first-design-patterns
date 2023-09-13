package com.design.patterns.course.creational.abstract_factory;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacityInMB);
}
