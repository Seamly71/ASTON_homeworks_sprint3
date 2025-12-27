package com.seamly71.aston_homework.strategy.strategies;

import java.math.BigDecimal;

public interface MechanicsStrategy {
    BigDecimal accelerate(
            final BigDecimal current_speed,
            final BigDecimal energy,
            final BigDecimal mass
    ) throws ArithmeticException;
}
