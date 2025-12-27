package com.seamly71.aston_homework.proxy;

import java.math.BigDecimal;

public class Demo {

    public static void main(String[] args) {
        BasicBankAccount realAccount = new BasicBankAccount(BigDecimal.ZERO);
        BankAccount debitView = new DebitAccountView(realAccount);

        debitView.addBalance(new BigDecimal("5"));
        System.out.println(debitView);
        System.out.println(realAccount);

        System.out.println();
        try {
            debitView.subtractBalance(new BigDecimal("10"));
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(debitView);
        System.out.println(realAccount);

        System.out.println();
        realAccount.subtractBalance(new BigDecimal("10"));
        System.out.println(debitView);
        System.out.println(realAccount);
    }
}
