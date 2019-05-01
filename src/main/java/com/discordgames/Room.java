package com.discordgames;

import java.util.ArrayList;
import java.util.List;

public class Room {
    List<Puzzle> puzzles;

    // Lots of constructors
    public Room(List<Puzzle> puzzles) {
        this.puzzles = puzzles;
    }

    // Puzzle Array Room
    public Room(Puzzle[] puzzles) {
        this.puzzles = new ArrayList<Puzzle>(puzzles.length);
        for (Puzzle puzzle : puzzles)
            addPuzzle(puzzle);
    }

    // No puzzle Room
    public Room() {
        this.puzzles = new ArrayList<Puzzle>(1);
    }

    // Single Puzzle Room
    public Room(Puzzle puzzle) {
        this();
        addPuzzle(puzzle);
    }

    // Adds a puzzle to Room
    public void addPuzzle(Puzzle puzzle) {
        this.puzzles.add(puzzle);
    }

    public boolean solvePuzzle(int puzzleIndex, String attempt) {
        return puzzles.get(puzzleIndex).solve(attempt);
    }
}