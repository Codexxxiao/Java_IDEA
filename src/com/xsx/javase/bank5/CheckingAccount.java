package com.xsx.javase.bank5;

/**
 * @author xsx
 * @create 2020-06-10-10:09
 */
public class CheckingAccount extends Account{
    private double overdtaftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdtaftProtection) {
        super(balance);
        this.overdtaftProtection = overdtaftProtection;
    }

    @Override
    public boolean withdraw(double amt) {

        //余额足够
        if(balance>=amt){
            balance-=amt;
        }else
        {
            //透支保护足够
            if (overdtaftProtection >= (amt - balance)) {
                overdtaftProtection-=(amt-balance);
                balance=0;
            }
            //余额不足，透支保护不足
            else {
                return false;
            }
        }
        return true;
    }
}
