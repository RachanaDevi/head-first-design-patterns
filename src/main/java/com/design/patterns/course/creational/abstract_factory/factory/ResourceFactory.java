package com.design.patterns.course.creational.abstract_factory.factory;

import com.design.patterns.course.creational.abstract_factory.Instance;
import com.design.patterns.course.creational.abstract_factory.Storage;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacityInMB);
}
