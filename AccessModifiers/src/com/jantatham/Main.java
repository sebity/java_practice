package com.jantatham;

/**
 * Created by jan on 26/03/17.
 */
public class Main {
    public static void main(String[] args) {
        Account jansAccount = new Account("Jan");
        jansAccount.deposit(1000);
        jansAccount.withdraw(500);
        jansAccount.withdraw(-200);
        jansAccount.deposit(-20);
        jansAccount.calculateBalance();

        System.out.println("Balance on account is " + jansAccount.getBalance());
    }
}
