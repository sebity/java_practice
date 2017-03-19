package com.jantatham;

/**
 * Created by jan on 08/03/17.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("VIP Name", 2000.00, "default@email.com");
    }

    public VipCustomer(String name, String email) {
        this(name, 2000.00, email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
