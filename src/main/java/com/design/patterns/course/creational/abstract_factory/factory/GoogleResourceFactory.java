package com.design.patterns.course.creational.abstract_factory.factory;

import com.design.patterns.course.creational.abstract_factory.storage.GoogleCloudStorage;
import com.design.patterns.course.creational.abstract_factory.storage.GoogleComputeEngineInstance;
import com.design.patterns.course.creational.abstract_factory.storage.Instance;
import com.design.patterns.course.creational.abstract_factory.storage.Storage;

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
