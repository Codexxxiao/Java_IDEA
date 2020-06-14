package com.xsx.javase.bank53;

/**
 * @author xsx
 * @create 2020-06-10-10:09
 */
public class CheckingAccount extends Account {
    private SavingAccount protecteBy;


    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, SavingAccount protecteBy) {
        super(balance);
        this.protecteBy = protecteBy;
    }

    @Override
    public boolean withdraw(double amt) {

        //余额足够
        if(balance>=amt){
            balance-=amt;
        }else
        {
            //透支保护足够
            if (protecteBy!=null && protecteBy.getBalance() >= (amt - balance)) {
                protecteBy.withdraw(amt-balance);
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
