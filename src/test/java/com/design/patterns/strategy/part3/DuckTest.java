package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.FlyNoWay;
import com.design.patterns.strategy.part3.behaviour.FlyWithWings;
import com.design.patterns.strategy.part3.behaviour.Quack;
import com.design.patterns.strategy.part3.behaviour.Squeak;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DuckTest {

    @Test
    void shouldFlyWithNoWingsForRubberDuck() {
        Duck rubberDuck = new RubberDuck(); // follows LSP

        assertThat(rubberDuck.fly()).isEqualTo(FlyNoWay.INSTANCE.fly());
    }

    @Test
    void shouldFlyWithWingsForMallardDuck() {
        Duck mallardDuck = new MallardDuck(); // follows LSP

        assertThat(mallardDuck.fly()).isEqualTo(FlyWithWings.INSTANCE.fly());
    }

    @Test
    void shouldFlyWithWingsForRedHeadDuck() {
        Duck redHeadDuck = new RedheadDuck(); // follows LSP

        assertThat(redHeadDuck.fly()).isEqualTo(FlyWithWings.INSTANCE.fly());
    }

    @Test
    void shouldSqueakForRubberDuck() {
        Duck rubberDuck = new RubberDuck(); // follows LSP

        assertThat(rubberDuck.quack()).isEqualTo(Squeak.INSTANCE.quack());
    }

    @Test
    void shouldQuackForRedheadDuck() {
        Duck redHeadDuck = new RedheadDuck(); // follows LSP

        assertThat(redHeadDuck.quack()).isEqualTo(Quack.INSTANCE.quack());
    }

    @Test
    void shouldQuackForMallardDuck() {
        Duck redHeadDuck = new MallardDuck(); // follows LSP

        assertThat(redHeadDuck.quack()).isEqualTo(Quack.INSTANCE.quack());
    }
}