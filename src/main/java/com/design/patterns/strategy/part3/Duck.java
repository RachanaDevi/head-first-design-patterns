package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.FlyBehaviour;
import com.design.patterns.strategy.part3.behaviour.QuackBehaviour;
import com.design.patterns.strategy.part3_experiment.behaviour.WaddleBehaviour;

public abstract class Duck {

    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;
    private WaddleBehaviour waddleBehaviour;
    // adding this behaviour instance
    // makes it very clear that we are again having the problem of inheritance

    // CHANGE-ADD-BEHAVIOUR 1 changing constructor which affects other Duck classes
    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour, WaddleBehaviour waddleBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.waddleBehaviour = waddleBehaviour;
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

    public String waddle() {
        return waddleBehaviour.waddle();
    }
}
