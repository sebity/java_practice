package com.jantatham;

/**
 * Created by jan on 07/03/17.
 */
public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("A12345", 0.00, "Joe Bloggs", "jbloggs@test.com", "01582 444333");

        System.out.println("Customer: " + acc1.getCustomerName());
        acc1.depositFunds(23.45);
        acc1.withdrawFunds(23.45);


        VipCustomer vip1 = new VipCustomer();
        System.out.println("Name: " + vip1.getName());

        VipCustomer vip2 = new VipCustomer("Jim", "jim@email.com");
        System.out.println("Name: " + vip2.getName());

        VipCustomer vip3 = new VipCustomer("Joe", 1235, "joe@email.com");
        System.out.println("Name: " + vip3.getName());
    }
}
