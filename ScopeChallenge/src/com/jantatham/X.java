package com.jantatham;

import java.util.Scanner;

/**
 * Created by jan on 26/03/17.
 */
public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please Enter a number: ");
        this.x = x.nextInt();
    }
    public void x() {
        for(int x = 1; x <= 12; x++) {
            System.out.println(x + " x " + this.x + " = " + (x * this.x));
        }
    }
}
