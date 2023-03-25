package com.design.patterns.strategy.part3_experiment;

import com.design.patterns.strategy.part3_experiment.behaviour.FlyBehaviour;
import com.design.patterns.strategy.part3_experiment.behaviour.FlyWithWings;
import com.design.patterns.strategy.part3_experiment.behaviour.Quack;
import com.design.patterns.strategy.part3_experiment.behaviour.QuackBehaviour;

public class RedheadDuck extends Duck implements FlyBehaviour, QuackBehaviour {

    @Override
    public String fly() {
        return FlyWithWings.INSTANCE.fly();
    }

    @Override
    public String quack() {
        return Quack.INSTANCE.quack();
    }
}
