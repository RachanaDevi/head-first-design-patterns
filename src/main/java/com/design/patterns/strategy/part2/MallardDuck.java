package com.design.patterns.strategy.part2;

import com.design.patterns.strategy.part2.behaviour.Flyable;
import com.design.patterns.strategy.part2.behaviour.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public String display() {
        return "I AM A MALLARD DUCK";
    }

    @Override
    public String fly() {
        return "I CAN FLY";
    }

    @Override
    public String quack() {
        return "I CAN QUACK";
    }
}
