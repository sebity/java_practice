package com.jantatham;

/**
 * Created by jan on 15/03/17.
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Natwest");

        bank.addBranch("Luton");

        bank.addCustomer("Luton", "Jan", 200.00);
        bank.addCustomer("Luton", "Jim", 10.00);
        bank.addCustomer("Luton", "Sally", 45.34);

        bank.addBranch("Hitchin");
        bank.addCustomer("Hitchin", "Mike", 128.33);

        bank.addCustomerTransaction("Luton", "Jan", 23.00);
        bank.addCustomerTransaction("Luton", "Jan", 12.60);

        bank.listCustomers("Luton", true);

        if(!bank.addCustomer("Watford", "Brian", 5.54)) {
            System.out.println("Error Watford branch does not exit");
        }
    }
}
