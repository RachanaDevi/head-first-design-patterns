package com.design.patterns.course.creational.factory_method.creator;

import com.design.patterns.course.creational.factory_method.Message;

public abstract class MessageCreator {

    public Message getMessage(){
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }


    // factory method
    public abstract Message createMessage();
}
