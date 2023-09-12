package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.*;

import java.util.List;

public class MallardDuck extends Duck {

    // CHANGE-ADD-BEHAVIOUR 1 changing constructor which affects other Duck classes
    public MallardDuck() {
        super(List.of(new FlyWithWings(), new Quack(), new Waddle()));
    }

    //Program to interfaces ++++ Compose using interfaces ..
    public MallardDuck(List<Behaviour> behaviors) {
        super(behaviors);
    }

    @Override
    public String display() {
        return "I AM A MALLARD DUCK" + this.waddle();
    }
}
