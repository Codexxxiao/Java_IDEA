package com.xsx.javase.bank7;

/**
 * @author xsx
 * @create 2020-06-10-9:06
 */
public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amt){
        balance+=amt;
        return true;
    }
    public void withdraw(double amt){
        if(balance<amt){
            throw new OverdraftException("资金不足",(amt-balance));
        }else {
            balance -= amt;
        }
    }
}
