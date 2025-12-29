package com.seamly71.astonhomework.proxy;

import java.math.BigDecimal;

public interface BankAccount {

    BigDecimal getBalance();

    void addBalance(BigDecimal difference);

    void subtractBalance(BigDecimal difference);
}
