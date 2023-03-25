package com.design.patterns.strategy.part1;

public class Duck {
    private int wingsCount;

    // introducing wingsCount leads to impact all the other subclasses.
    public Duck(int wingsCount) {
        this.wingsCount = wingsCount;
    }

    public void swim() {
        System.out.println("SWIM");
    }

    public String display() {
       return "ITS ME, the duck";
    }

    public void quack() {
        System.out.println("QUACK");
    }

    public String fly(){
        return "I CAN FLYYYY";
    }
}
