package com.seamly71.astonhomework.proxy;

import java.math.BigDecimal;

public class BasicBankAccount implements BankAccount {

    private BigDecimal balance;

    public BasicBankAccount(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void addBalance(BigDecimal difference) {
        balance = balance.add(difference);
    }

    @Override
    public void subtractBalance(BigDecimal difference) {
        balance = balance.subtract(difference);
    }

    @Override
    public String toString() {
        return String.format("Текущий баланс: %s", balance.toPlainString());
    }
}
