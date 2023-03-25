package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.Behaviour;
import com.design.patterns.strategy.part3.behaviour.FlyBehaviour;
import com.design.patterns.strategy.part3.behaviour.QuackBehaviour;
import com.design.patterns.strategy.part3.behaviour.WaddleBehaviour;

import java.util.List;

public abstract class Duck {

    private List<Behaviour> behaviours;
    // adding this behaviour instance
    // makes it very clear that we are again having the problem of inheritance

    // CHANGE-ADD-BEHAVIOUR 1 changing constructor which affects other Duck classes
    // so we add an abstraction over it, program to an interface not an implementation
    public Duck(List<Behaviour> behaviours) {
        this.behaviours = behaviours;
    }

    public void swim() {
        System.out.println("SWIM");
    }

    public String display() {
        return "ITS ME, the duck";
    }

    public String fly() {
        return behaviours.stream().filter(e -> e instanceof FlyBehaviour).findFirst().get().invoke();
    }

    public String quack() {
        return behaviours.stream().filter(e -> e instanceof QuackBehaviour).findFirst().get().invoke();
    }

    public String waddle() {
        return behaviours.stream().filter(e -> e instanceof WaddleBehaviour).findFirst().get().invoke();
    }
}
