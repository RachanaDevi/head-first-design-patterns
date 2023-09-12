package com.design.patterns.strategy.part3.behaviour;

public class FlyWithWings implements FlyBehaviour {

    public static final FlyWithWings INSTANCE = new FlyWithWings();

    // this has to be removed

    // strategy+state+composition
    // maintaining strategy and state
    @Override
    public String fly() {
        return "I CAN FLY"; //state
    }

    @Override
    public String invoke() {
        return fly();
    }
}
