package com.seamly71.aston_homework.strategy;

import com.seamly71.aston_homework.strategy.strategies.MechanicsStrategy;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Spaceship {

    @Setter
    @Getter
    private BigDecimal speed;
    @Getter
    private final BigDecimal mass;

    private final MechanicsStrategy mechanicsStrategy;

    Spaceship(
            final BigDecimal mass,
            MechanicsStrategy mechanicsStrategy
    ){
        this.mass = mass;
        this.speed = BigDecimal.ZERO;
        this.mechanicsStrategy = mechanicsStrategy;
    }

    Spaceship(
            final BigDecimal mass,
            final BigDecimal speed,
            MechanicsStrategy mechanicsStrategy
    ){
        this.mass = mass;
        this.speed = speed;
        this.mechanicsStrategy = mechanicsStrategy;
    }

    public String toString(){
        return String.format(
                "Mass: %s. Speed: %s.",
                mass.toString(),
                speed.toString()
        );
    }

    public void accelerate(final BigDecimal energy) {
        speed = mechanicsStrategy.accelerate(
            speed,
            energy,
            mass
        );
    }
}
