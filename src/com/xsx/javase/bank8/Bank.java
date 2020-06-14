package com.xsx.javase.bank8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xsx
 * @create 2020-06-10-9:48
 */
public class Bank {



//    private Customer[] customers;
//    private int numberOfCustomer;

    private List<Customer> customers;

    private Bank(){

        customers = new ArrayList<>();
    }

    private static Bank bank = new Bank();

    public static Bank getBank() {
        return bank;
    }

    public void addCustomer(String f, String l){
//        Customer customer = new Customer(f,l);
//        customers[numberOfCustomer] = customer;
//        numberOfCustomer++;
        customers.add(new Customer(f,l));
    }

    public int getNumberOfCustomer() {

//        return numberOfCustomer;
        return customers.size();
    }


    public Customer getCustomer(int index) {

//        return customers[index];
        return customers.get(index);
    }
    public Iterator<Customer> getCustomers(){
        return customers.iterator();
    }
}
