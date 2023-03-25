package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.FlyNoWay;
import com.design.patterns.strategy.part3.behaviour.NoWaddle;
import com.design.patterns.strategy.part3.behaviour.Squeak;

public class RubberDuck extends Duck {

    // CHANGE-ADD-BEHAVIOUR 1 changing constructor which affects other Duck classes
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak(), new NoWaddle());
    }

    @Override
    public String quack() {
        return "I CAN SQUEAK";
    }
}
