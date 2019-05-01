package com.discordgames;

import java.util.ArrayList;

public class RoomManager extends ArrayList<Room> {

    // Generated
    private static final long serialVersionUID = -2434665451773970524L;

    public RoomManager(Room room) {
        super(1);
        this.add(room);
    }

    public RoomManager() {
        super();
    }
}