package com.seamly71.aston_homework.strategy.strategies;

import java.math.BigDecimal;
import java.math.MathContext;

public class RelativisticMechanics implements MechanicsStrategy {

    private static final BigDecimal cSquared = new BigDecimal("89875517900000000");
    private static final MathContext mathContext = MathContext.DECIMAL32;

    @Override
    public BigDecimal accelerate(
            final BigDecimal current_speed,
            final BigDecimal energy,
            final BigDecimal mass
    ) throws ArithmeticException {
        BigDecimal firstTerm = BigDecimal.ONE.subtract(
                current_speed.multiply(current_speed).divide(cSquared, mathContext)
        );
        BigDecimal secondTerm = energy.divide(mass, mathContext)
                .divide(cSquared, mathContext);
        return BigDecimal.ONE.subtract(BigDecimal.ONE.divide(
                firstTerm.add(secondTerm).sqrt(mathContext),
                mathContext
        )).multiply(cSquared).sqrt(mathContext);
    }
}
