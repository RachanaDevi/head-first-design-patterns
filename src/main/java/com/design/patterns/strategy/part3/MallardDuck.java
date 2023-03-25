package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.FlyWithWings;
import com.design.patterns.strategy.part3.behaviour.Quack;
import com.design.patterns.strategy.part3_experiment.behaviour.Waddle;

public class MallardDuck extends Duck {

    // CHANGE-ADD-BEHAVIOUR 1 changing constructor which affects other Duck classes
    public MallardDuck() {
        super(new FlyWithWings(), new Quack(), new Waddle());
    }

    @Override
    public String display() {
        return "I AM A MALLARD DUCK";
    }
}
