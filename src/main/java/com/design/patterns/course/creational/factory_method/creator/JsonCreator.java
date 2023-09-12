package com.design.patterns.course.creational.factory_method.creator;

import com.design.patterns.course.creational.factory_method.JsonMessage;
import com.design.patterns.course.creational.factory_method.Message;

public class JsonCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
