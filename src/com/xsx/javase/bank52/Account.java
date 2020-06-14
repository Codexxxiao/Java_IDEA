package com.xsx.javase.bank52;

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
    public boolean withdraw(double amt){
        if(balance<amt){
            return false;
        }else {
            balance -= amt;
            return true;
        }
    }
}
