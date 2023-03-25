package com.design.patterns.strategy.part3.behaviour;

import com.design.patterns.strategy.part3_experiment.behaviour.WaddleBehaviour;

public class NoWaddle implements WaddleBehaviour {

    public static final NoWaddle INSTANCE = new NoWaddle();

    @Override
    public String waddle() {
        return "NO WADDLING FOR ME";
    }
}
