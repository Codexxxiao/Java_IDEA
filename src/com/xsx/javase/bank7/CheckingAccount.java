package com.xsx.javase.bank7;

/**
 * @author xsx
 * @create 2020-06-10-10:09
 */
public class CheckingAccount extends Account {
    private double overdtaftProtection = -1;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdtaftProtection) {
        super(balance);
        this.overdtaftProtection = overdtaftProtection;
    }

    @Override
    public void withdraw(double amt) {

        //余额足够
        if(balance>=amt){
            balance-=amt;
        }else
        {
            if(overdtaftProtection == -1){
                throw new OverdraftException("no overdtaft protect",amt-balance);
            }
            //透支保护足够
            if (overdtaftProtection >= (amt - balance)) {
                overdtaftProtection-=(amt-balance);
                balance=0;
            }
            //余额不足，透支保护不足
            else {
                throw  new OverdraftException("Insufficient funds for overdraft protect",amt-balance);
            }
        }
    }
}
