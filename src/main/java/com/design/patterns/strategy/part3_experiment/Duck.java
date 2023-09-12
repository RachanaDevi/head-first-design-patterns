package com.design.patterns.strategy.part3_experiment;

public class Duck {

    // if we remove this it will impact all ducks
    // open in Kotlin
    public void swim() {
        System.out.println("SWIM");
    }

    public String display() {
        return "ITS ME, the duck";
    }
}
