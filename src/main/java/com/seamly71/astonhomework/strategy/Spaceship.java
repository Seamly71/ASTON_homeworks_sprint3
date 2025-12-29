package com.seamly71.astonhomework.strategy;

import com.seamly71.astonhomework.strategy.strategies.MechanicsStrategy;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;


@Getter
public class Spaceship {

    @Setter
    private BigDecimal speed;
    private final BigDecimal mass;

    private final MechanicsStrategy mechanicsStrategy;

    Spaceship(
            final BigDecimal mass,
            MechanicsStrategy mechanicsStrategy
    ) {
        this.mass = mass;
        this.speed = BigDecimal.ZERO;
        this.mechanicsStrategy = mechanicsStrategy;
    }

    Spaceship(
            final BigDecimal mass,
            final BigDecimal speed,
            MechanicsStrategy mechanicsStrategy
    ) {
        this.mass = mass;
        this.speed = speed;
        this.mechanicsStrategy = mechanicsStrategy;
    }

    public String toString() {
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
