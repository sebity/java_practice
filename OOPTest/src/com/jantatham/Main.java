package com.jantatham;

import java.text.DecimalFormat;

/**
 * Created by jan on 11/03/17.
 */
public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("####0.00");

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is £" + df.format(hamburger.itemizeHamburger()));

        HealthyBurger healthyBurger = new HealthyBurger("Hallumi", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 1.27);
        healthyBurger.addHealthyAddition1("Feta", 0.75);
        System.out.println("Total Healthy Burger price is £" + df.format(healthyBurger.itemizeHamburger()));

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    }
}
