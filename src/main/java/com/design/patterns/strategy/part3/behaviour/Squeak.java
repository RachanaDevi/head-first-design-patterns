package com.design.patterns.strategy.part3.behaviour;

public class Squeak implements QuackBehaviour {

    public static final Squeak INSTANCE = new Squeak();

    @Override
    public String quack() {
        return "I CAN SQUEAK";
    }

    @Override
    public String invoke() {
        return quack();
    }
}
