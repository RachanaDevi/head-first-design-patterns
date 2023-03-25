package com.design.patterns.strategy.part2;

import com.design.patterns.strategy.part2.behaviour.Quackable;

public class RubberDuck implements Quackable {
    @Override
    public String quack() {
        return "I CAN SQUEAK";
    }
}
