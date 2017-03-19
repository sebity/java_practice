package com.jantatham;

/**
 * Created by jan on 07/03/17.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("escort")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
