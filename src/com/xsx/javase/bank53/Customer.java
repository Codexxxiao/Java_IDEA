package com.xsx.javase.bank53;

/**
 * @author xsx
 * @create 2020-06-10-9:14
 */
public class Customer {
    private String firstName;
    private String lastName;
    private SavingAccount savingsAccount;
    private CheckingAccount checkingAccount;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public SavingAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
}
