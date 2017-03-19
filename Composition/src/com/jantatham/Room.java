package com.jantatham;

/**
 * Created by jan on 10/03/17.
 */
public class Room {
    private String name;
    private int doors;
    private Boolean windows;
    private Dimensions dimensions;

    public Room(String name, int doors, Boolean windows, Dimensions dimensions) {
        this.name = name;
        this.doors = doors;
        this.windows = windows;
        this.dimensions = dimensions;
    }

    public void roomSize() {
        System.out.println("The room is " + dimensions.getWidth() + " x " + dimensions.getDepth() + " feet.");
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }

    public Boolean getWindows() {
        return windows;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
