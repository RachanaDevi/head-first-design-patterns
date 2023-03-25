package com.design.patterns.strategy.part3_experiment.behaviour;

public class Quack implements QuackBehaviour {

    public static final Quack INSTANCE = new Quack();

    @Override
    public String quack() {
        return "I CAN QUACK";
    }
}
