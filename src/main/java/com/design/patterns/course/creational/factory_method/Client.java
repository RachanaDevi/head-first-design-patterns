package com.design.patterns.course.creational.factory_method;

import com.design.patterns.course.creational.factory_method.creator.JsonCreator;
import com.design.patterns.course.creational.factory_method.creator.MessageCreator;
import com.design.patterns.course.creational.factory_method.creator.TextCreator;

public class Client {

    public static void main(String[] args) {
        printMessage(new JsonCreator());
        printMessage(new TextCreator());
    }

    private static void printMessage(MessageCreator messageCreator) {
        Message message = messageCreator.getMessage();
        System.out.println(message);
    }
}
