package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.FlyWithWings;
import com.design.patterns.strategy.part3.behaviour.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }
}
