package com.discordgames;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Puzzle> puzzles;
    private String name;

    // Lots of constructors
    public Room(String name, List<Puzzle> puzzles) {
        this.name = name;
        this.puzzles = puzzles;
    }

    // Puzzle Array Room
    public Room(String name, Puzzle[] puzzles) {
        this.name = name;
        this.puzzles = new ArrayList<Puzzle>(puzzles.length);
        for (Puzzle puzzle : puzzles)
            addPuzzle(puzzle);
    }

    // No puzzle Room
    public Room(String name) {
        this.puzzles = new ArrayList<Puzzle>(1);
    }

    // Single Puzzle Room
    public Room(String name, Puzzle puzzle) {
        this(name);
        addPuzzle(puzzle);
    }

    public String getName() {
        return name;
    }

    // Adds a puzzle to Room
    public void addPuzzle(Puzzle puzzle) {
        this.puzzles.add(puzzle);
    }

    public boolean solvePuzzle(int puzzleIndex, String attempt) {
        return puzzles.get(puzzleIndex).solve(attempt);
    }
}