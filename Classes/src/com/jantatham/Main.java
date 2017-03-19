package com.jantatham;

/**
 * Created by jan on 07/03/17.
 */
public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car rover = new Car();

        porsche.setModel("Carrera");
        System.out.println("The porsche is a " + porsche.getModel());

        porsche.setModel("911");
        System.out.println("The porsche is a " + porsche.getModel());

        rover.setModel("75");
        System.out.println("The porsche is a " + rover.getModel());
    }
}
