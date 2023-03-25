package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.FlyNoWay;
import com.design.patterns.strategy.part3.behaviour.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public String quack() {
        return "I CAN SQUEAK";
    }
}
