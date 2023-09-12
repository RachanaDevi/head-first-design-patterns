package com.design.patterns.course.creational.factory_method.creator;

import com.design.patterns.course.creational.factory_method.Message;
import com.design.patterns.course.creational.factory_method.TextMessage;

public class TextCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
