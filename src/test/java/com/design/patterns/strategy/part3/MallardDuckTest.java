package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.FlyNoWay;
import com.design.patterns.strategy.part3.behaviour.FlyWithWings;
import org.junit.jupiter.api.Test;

import java.util.List;


class MallardDuckTest {

    @Test
    void name() {
        MallardDuck mallardDuck = new MallardDuck(List.of(FlyNoWay.INSTANCE)); // passing behaviours
    }
}