package com.design.patterns.strategy.part3_experiment.behaviour;

public class Waddle implements WaddleBehaviour {

    public static final Waddle INSTANCE = new Waddle();

    @Override
    public String waddle() {
        return "WADDLE";
    }
}
