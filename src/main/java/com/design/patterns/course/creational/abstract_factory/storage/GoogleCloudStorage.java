package com.design.patterns.course.creational.abstract_factory.storage;

public class GoogleCloudStorage implements Storage {
    @Override
    public String getId() {
        return "GoogleCloudStorage";
    }

    public GoogleCloudStorage(int capacityInMB) {
        System.out.println("Allocated " + capacityInMB + " on Google Cloud Storage");
    }

    @Override
    public String toString() {
        return "GoogleCloudStorage";
    }
}
