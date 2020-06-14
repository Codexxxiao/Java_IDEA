package com.xsx.javase.bank5;

/**
 * @author xsx
 * @create 2020-06-10-9:48
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank(){
        customers = new Customer[100];
    }

    public void addCustomer(String f,String l){
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
