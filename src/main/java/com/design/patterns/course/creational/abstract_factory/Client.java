package com.design.patterns.course.creational.abstract_factory;

import com.design.patterns.course.creational.abstract_factory.factory.AwsResourceFactory;
import com.design.patterns.course.creational.abstract_factory.factory.ResourceFactory;
import com.design.patterns.course.creational.abstract_factory.storage.Instance;
import com.design.patterns.course.creational.abstract_factory.storage.Storage;

public class Client {

    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capactiy, int storageInMb) {
        Instance instance = resourceFactory.createInstance(capactiy);
        Storage storage = resourceFactory.createStorage(storageInMb);

        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client client = new Client(new AwsResourceFactory());
        Instance server = client.createServer(Instance.Capacity.micro, 20480);

        server.start();
        server.stop();
    }
}
