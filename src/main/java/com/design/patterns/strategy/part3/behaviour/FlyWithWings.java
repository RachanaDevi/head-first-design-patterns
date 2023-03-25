package com.design.patterns.strategy.part3.behaviour;

public class FlyWithWings implements FlyBehaviour {

    public static final FlyWithWings INSTANCE = new FlyWithWings();

    @Override
    public String fly() {
        return "I CAN FLY";
    }
}
