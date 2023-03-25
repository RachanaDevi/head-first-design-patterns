package com.design.patterns.strategy.part3.behaviour;

public class Waddle implements WaddleBehaviour {

    public static final Waddle INSTANCE = new Waddle();

    @Override
    public String waddle() {
        return "WADDLE";
    }

    @Override
    public String invoke() {
        return waddle();
    }
}
