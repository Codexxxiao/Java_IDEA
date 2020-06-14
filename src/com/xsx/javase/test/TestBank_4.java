package com.xsx.javase.test;

import com.xsx.javase.bank3.Bank;
import com.xsx.javase.bank3.Customer;

/**
 * @author xsx
 * @create 2020-06-10-9:54
 */
public class TestBank_4 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Add Customer Jane, Simms
        // code
        bank.addCustomer("Jane", "Smms");

        // Add Customer Owen, Bryant
        // code
        bank.addCustomer("Owen", "Bryant");

        // Add Customer Tim, Soley
        // code
        bank.addCustomer("Tim", "Soley");

        // Add Customer Maria, Soley
        // code
        bank.addCustomer("Maria", "Soley");



        for (int i = 0; i < bank.getNumberOfCustomer(); i++) {
            Customer customer = bank.getCustomer(i);

            System.out.println("Customer [" + (i + 1) + "] is "
                    + customer.getLastName() + ", " + customer.getFirstName());
        }
    }
}
