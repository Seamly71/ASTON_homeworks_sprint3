package com.seamly71.astonhomework.strategy.strategies;

import java.math.BigDecimal;
import java.math.MathContext;

public class RelativisticMechanics implements MechanicsStrategy {

    private static final BigDecimal cSquared = new BigDecimal("89875517900000000");
    private static final MathContext mathContext = MathContext.DECIMAL32;

    @Override
    public BigDecimal accelerate(
            final BigDecimal currentSpeed,
            final BigDecimal energy,
            final BigDecimal mass
    ) throws ArithmeticException {
        BigDecimal firstTerm = BigDecimal.ONE.subtract(
                currentSpeed.multiply(currentSpeed).divide(cSquared, mathContext)
        );
        BigDecimal secondTerm = energy.divide(mass, mathContext)
                .divide(cSquared, mathContext);
        return BigDecimal.ONE.subtract(BigDecimal.ONE.divide(
            firstTerm.add(secondTerm).sqrt(mathContext),
            mathContext
        )).multiply(cSquared).sqrt(mathContext);
    }
}
