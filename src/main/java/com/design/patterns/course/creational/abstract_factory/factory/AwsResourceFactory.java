package com.design.patterns.course.creational.abstract_factory.factory;

import com.design.patterns.course.creational.abstract_factory.EC2Instance;
import com.design.patterns.course.creational.abstract_factory.Instance;
import com.design.patterns.course.creational.abstract_factory.S3Storage;
import com.design.patterns.course.creational.abstract_factory.Storage;

public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMB) {
        return new S3Storage(capacityInMB);
    }
}
