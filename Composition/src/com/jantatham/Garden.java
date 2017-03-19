package com.jantatham;

/**
 * Created by jan on 10/03/17.
 */
public class Garden {
    private int width;
    private int depth;
    private Boolean grass;

    public Garden(int width, int depth, Boolean grass) {
        this.width = width;
        this.depth = depth;
        this.grass = grass;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public Boolean getGrass() {
        return grass;
    }
}
