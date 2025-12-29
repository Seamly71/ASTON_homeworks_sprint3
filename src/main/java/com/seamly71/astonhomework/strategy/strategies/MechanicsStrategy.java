package com.seamly71.astonhomework.strategy.strategies;

import java.math.BigDecimal;

public interface MechanicsStrategy {
    BigDecimal accelerate(
            final BigDecimal currentSpeed,
            final BigDecimal energy,
            final BigDecimal mass
    ) throws ArithmeticException;
}
