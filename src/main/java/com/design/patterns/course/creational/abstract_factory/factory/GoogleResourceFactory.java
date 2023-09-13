package com.design.patterns.course.creational.abstract_factory.factory;

import com.design.patterns.course.creational.abstract_factory.GoogleCloudStorage;
import com.design.patterns.course.creational.abstract_factory.GoogleComputeEngineInstance;
import com.design.patterns.course.creational.abstract_factory.Instance;
import com.design.patterns.course.creational.abstract_factory.Storage;

public class GoogleResourceFactory implements  ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMB) {
        return new GoogleCloudStorage(capacityInMB);
    }
}
