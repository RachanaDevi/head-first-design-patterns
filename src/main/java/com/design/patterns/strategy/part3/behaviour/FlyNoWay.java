package com.design.patterns.strategy.part3.behaviour;

public class FlyNoWay implements FlyBehaviour {

    public static final FlyNoWay INSTANCE = new FlyNoWay();

    @Override
    public String fly() {
        return "I CAN'T FLY";
    }

    @Override
    public String invoke() {
        return fly();
    }
}
