package com.xsx.javase.bank6;

/**
 * @author xsx
 * @create 2020-06-10-9:14
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts;
    private int numberOfAccount;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new Account[2];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account account) {
        accounts[numberOfAccount++]=account;
    }

    public Account getAccount(int index){
        return accounts[index];
    }

    public int getNumberOfAccounts() {
        return numberOfAccount;
    }
}
