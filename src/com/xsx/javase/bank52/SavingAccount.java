package com.xsx.javase.bank52;

/**
 * @author xsx
 * @create 2020-06-10-10:07
 */
public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
}
