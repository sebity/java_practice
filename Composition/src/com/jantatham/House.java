package com.jantatham;

/**
 * Created by jan on 10/03/17.
 */
public class House {
    private Room room;
    private Garden garden;

    public House(Room room, Garden garden) {
        this.room = room;
        this.garden = garden;
    }

    public void roomSize() {
        room.roomSize();
    }
}
