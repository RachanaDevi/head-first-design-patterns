package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.FlyWithWings;
import com.design.patterns.strategy.part3.behaviour.Quack;
import com.design.patterns.strategy.part3.behaviour.Waddle;

import java.util.List;

public class RedheadDuck extends Duck {

    // CHANGE-ADD-BEHAVIOUR 1 changing constructor which affects other Duck classes
    public RedheadDuck() {
        super(List.of(new FlyWithWings(), new Quack(), new Waddle()));
    }
}
