package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.FlyWithWings;
import com.design.patterns.strategy.part3.behaviour.Quack;
import com.design.patterns.strategy.part3.behaviour.Waddle;

import java.util.List;

public class MallardDuck extends Duck {

    // CHANGE-ADD-BEHAVIOUR 1 changing constructor which affects other Duck classes
    public MallardDuck() {
        super(List.of(new FlyWithWings(), new Quack(), new Waddle()));
    }

    @Override
    public String display() {
        return "I AM A MALLARD DUCK";
    }
}
