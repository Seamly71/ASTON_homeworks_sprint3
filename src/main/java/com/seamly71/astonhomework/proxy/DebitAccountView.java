package com.seamly71.astonhomework.proxy;

import java.math.BigDecimal;

public class DebitAccountView implements BankAccount {

    private BasicBankAccount account;

    public DebitAccountView(BasicBankAccount account) {
        this.account = account;
    }

    @Override
    public BigDecimal getBalance() {
        return account.getBalance();
    }

    @Override
    public void addBalance(BigDecimal difference) {
        BigDecimal finalValue = account.getBalance().add(difference);
        this.validateBalance(finalValue);
        account.addBalance(difference);
    }

    @Override
    public void subtractBalance(BigDecimal difference) {
        BigDecimal finalValue = account.getBalance().subtract(difference);
        this.validateBalance(finalValue);
        account.addBalance(difference);
    }

    @Override
    public String toString() {
        return String.format(
                "Текущий баланс: %s",
                account.getBalance().toPlainString()
        );
    }

    private void validateBalance(BigDecimal balance) {
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new ArithmeticException(
                    "Баланс дебетового аккаунта не может быть отрицательным."
            );
        }
    }
}
