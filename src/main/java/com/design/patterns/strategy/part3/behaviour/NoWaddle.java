package com.design.patterns.strategy.part3.behaviour;


public class NoWaddle implements WaddleBehaviour {

    public static final NoWaddle INSTANCE = new NoWaddle();

    @Override
    public String waddle() {
        return "NO WADDLING FOR ME";
    }

    @Override
    public String invoke() {
        return waddle();
    }
}
