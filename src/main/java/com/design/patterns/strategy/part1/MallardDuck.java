package com.design.patterns.strategy.part1;

public class MallardDuck extends Duck {

//    adding wingsCount here (CHANGE-1)
    public MallardDuck(int wingsCount) {
        super(wingsCount);
    }

    @Override
    public String display() {
        return "I AM A MALLARD DUCK";
    }
}
