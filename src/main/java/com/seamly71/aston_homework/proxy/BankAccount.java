package com.seamly71.aston_homework.proxy;

import java.math.BigDecimal;

public interface BankAccount {

    BigDecimal getBalance();

    void addBalance(BigDecimal difference);

    void subtractBalance(BigDecimal difference);
}
