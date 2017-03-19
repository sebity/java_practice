package com.jantatham;

/**
 * Created by jan on 07/03/17.
 */
public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("B2344", 2.50, "Default Name", "Default Address", "Default Phone");
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " made.");
        System.out.println("New balance = " + this.balance);
    }

    public void withdrawFunds(double withdrawal) {
        if (withdrawal > this.balance) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        }
        else {
            this.balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal + " processed");
            System.out.println("Remaining balance = " + this.balance);
        }
    }
}
