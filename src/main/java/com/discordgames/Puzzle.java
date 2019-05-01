package com.discordgames;

public class Puzzle {
    private String problem;
    private String solution;
    private boolean solved;

    public Puzzle(String problem, String solution) {
        this.problem = problem;
        this.solution = solution;
    }

    public String getProblem() {
        return problem;
    }

    public boolean isSolved() {
        return solved;
    }

    public boolean solve(String attempt) {
        if(attempt.equalsIgnoreCase(solution))
            solved = true;
        return solved;
    }
}