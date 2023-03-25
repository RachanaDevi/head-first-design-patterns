package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.FlyBehaviour;
import com.design.patterns.strategy.part3.behaviour.QuackBehaviour;

public abstract class Duck {

    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void swim() {
        System.out.println("SWIM");
    }

    public String display() {
        return "ITS ME, the duck";
    }

    public String fly() {
        return flyBehaviour.fly();
    }

    public String quack() {
        return quackBehaviour.quack();
    }
}
