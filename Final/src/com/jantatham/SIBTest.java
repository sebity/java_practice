package com.jantatham;

/**
 * Created by jan on 26/03/17.
 */
public class SIBTest {
    public static final String owner;

    static {
        owner = "jan";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
