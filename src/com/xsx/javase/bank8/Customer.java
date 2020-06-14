package com.xsx.javase.bank8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xsx
 * @create 2020-06-10-9:14
 */
public class Customer {
    private String firstName;
    private String lastName;
//    private Account[] accounts;
//    private int numberOfAccount;

    private List<Account> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        accounts = new Account[2];
        accounts = new ArrayList<>();
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account account) {

//        accounts[numberOfAccount++]=account;
        accounts.add(account);
    }

    public Account getAccount(int index){

//        return accounts[index];
        return accounts.get(index);
    }


    public int getNumberOfAccounts() {

//        return numberOfAccount;
        return accounts.size();
    }
    public Iterator<Account> getAccounts(){
        return  accounts.iterator();
    }
}
