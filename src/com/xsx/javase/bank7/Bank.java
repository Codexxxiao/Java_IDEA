package com.xsx.javase.bank7;

/**
 * @author xsx
 * @create 2020-06-10-9:48
 */
public class Bank {



    private Customer[] customers;
    private int numberOfCustomer;

    private Bank(){

        customers = new Customer[100];
    }

    private static Bank bank = new Bank();

    public static Bank getBank() {
        return bank;
    }

    public void addCustomer(String f, String l){
        Customer customer = new Customer(f,l);
        customers[numberOfCustomer] = customer;
        numberOfCustomer++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }
}
