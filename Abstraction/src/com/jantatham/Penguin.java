package com.jantatham;

/**
 * Created by jan on 18/03/17.
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that, can I go for a swim instead");
    }
}
