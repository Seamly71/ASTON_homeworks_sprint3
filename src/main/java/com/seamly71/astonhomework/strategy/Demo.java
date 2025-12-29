package com.seamly71.astonhomework.strategy;

import com.seamly71.astonhomework.strategy.strategies.NewtonianMechanics;
import com.seamly71.astonhomework.strategy.strategies.RelativisticMechanics;
import java.math.BigDecimal;

public class Demo {

    private static final BigDecimal mass = new BigDecimal("1");
    private static final BigDecimal accelerationEnergy = new BigDecimal("1000000000000");

    public static void main(String[] args) {
        Spaceship newtonianSpaceship = new Spaceship(
                mass,
                new NewtonianMechanics()
        );
        System.out.println(newtonianSpaceship);
        newtonianSpaceship.accelerate(accelerationEnergy);
        System.out.println(newtonianSpaceship);

        Spaceship relativisticSpaceship = new Spaceship(
                mass,
                new RelativisticMechanics()
        );
        System.out.println(relativisticSpaceship);
        relativisticSpaceship.accelerate(accelerationEnergy);
        System.out.println(relativisticSpaceship);
    }
}
