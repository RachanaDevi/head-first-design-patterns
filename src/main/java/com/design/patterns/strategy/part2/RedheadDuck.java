package com.design.patterns.strategy.part2;

import com.design.patterns.strategy.part2.behaviour.Flyable;
import com.design.patterns.strategy.part2.behaviour.Quackable;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public String fly() {
        return "I CAN FLY!";
    }

    @Override
    public String quack() {
        return "I CAN QUACK";
    }
}
