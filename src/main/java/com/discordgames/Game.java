package com.discordgames;

public class Game {
    RoomManager manager;

    public Game() {
        // Room 1
        Puzzle r1p1 = new Puzzle("write", "Solve the enigma", "answer", "a thing happened");
        Puzzle r1p2 = new Puzzle("type", "what is the phone number?", "18002455356", "another thing happened");
        Room r1 = new Room(r1p1);
        r1.addPuzzle(r1p2);

        // Room 2
        // more puzzles...
        Room r2 = new Room();

        // All Rooms
        manager = new RoomManager(r1);
        manager.add(r2);
    }
}