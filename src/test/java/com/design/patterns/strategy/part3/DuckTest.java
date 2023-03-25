package com.design.patterns.strategy.part3;

import com.design.patterns.strategy.part3.behaviour.*;
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
        Duck mallardDuck = new MallardDuck(); // follows LSP

        assertThat(mallardDuck.quack()).isEqualTo(Quack.INSTANCE.quack());
    }

    @Test
    void shouldNotWaddleForRubberDuck() {
        Duck rubberDuck = new RubberDuck(); // follows LSP

        assertThat(rubberDuck.waddle()).isEqualTo(NoWaddle.INSTANCE.waddle());
    }

    // methods are automatically added for subclasses
    @Test
    void shouldWaddleForRedheadDuck() {
        Duck redHeadDuck = new RedheadDuck(); // follows LSP

        assertThat(redHeadDuck.waddle()).isEqualTo(Waddle.INSTANCE.waddle());
    }

    @Test
    void shouldWaddleForMallardDuck() {
        Duck mallardDuck = new MallardDuck(); // follows LSP

        assertThat(mallardDuck.waddle()).isEqualTo(Waddle.INSTANCE.waddle());
    }
}