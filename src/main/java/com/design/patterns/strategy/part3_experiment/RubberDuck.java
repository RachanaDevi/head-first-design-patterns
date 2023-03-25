package com.design.patterns.strategy.part3_experiment;

import com.design.patterns.strategy.part3.behaviour.Squeak;
import com.design.patterns.strategy.part3_experiment.behaviour.FlyBehaviour;
import com.design.patterns.strategy.part3_experiment.behaviour.FlyNoWay;
import com.design.patterns.strategy.part3_experiment.behaviour.QuackBehaviour;

public class RubberDuck extends Duck implements FlyBehaviour, QuackBehaviour {

    @Override
    public String quack() {
        return Squeak.INSTANCE.quack();
    }

    @Override
    public String fly() {
        return FlyNoWay.INSTANCE.fly();
    }
}
