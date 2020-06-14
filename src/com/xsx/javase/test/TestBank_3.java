package com.xsx.javase.test;

import com.xsx.javase.bank3.Account;
import com.xsx.javase.bank3.Customer;

/**
 * @author xsx
 * @create 2020-06-10-9:29
 */
public class TestBank_3 {
    public static void main(String[] args) {
        Customer customer;
        Account account;

        // Create an account that can has a 500.00 balance.
        System.out.println("Creating the customer Jane Smith.");
        //code
        customer = new Customer("Jane", "Smith");

        System.out.println("Creating her account with a 500.00 balance.");
        customer.setAccount(new Account(500));
        //�� Jane Smith ���˻����� customer ����
        account = customer.getAccount();

        //code
        // Perform some account transactions
        System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
        System.out.println("Deposit 22.50: " + account.deposit(22.50));
        System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
        System.out.println("Withdraw 400.00: " + account.withdraw(400.00));

        // Print out the final account balance
        System.out.println("Customer [" + customer.getLastName()
                + ", " + customer.getFirstName()
                + "] has a balance of " + account.getBalance());
    }
}
