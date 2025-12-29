package com.seamly71.astonhomework.strategy.strategies;

import java.math.BigDecimal;
import java.math.MathContext;

public class NewtonianMechanics implements MechanicsStrategy {

    private static final BigDecimal energyMultiplier = new BigDecimal(2);
    private static final MathContext mathContext = MathContext.DECIMAL32;

    @Override
    public BigDecimal accelerate(
            final BigDecimal currentSpeed,
            final BigDecimal energy,
            final BigDecimal mass
    ) throws ArithmeticException {
        return currentSpeed.multiply(currentSpeed).add(
                energy.multiply(energyMultiplier).divide(mass, mathContext)
        ).sqrt(mathContext);
    }
}
