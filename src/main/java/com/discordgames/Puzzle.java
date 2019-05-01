package com.discordgames;

public class Puzzle {
    private String command;
    private String problem;
    private String solution;
    private String solvedMessage;
    private boolean solved;

    public Puzzle(String command, String problem, String solution, String solutionMessage) {
        this.command = command;
        this.problem = problem;
        this.solution = solution;
        this.solvedMessage = solutionMessage;
    }

    public String getCommand() {
        return this.command;
    }

    public String getMessage() {
        return (solved) ? solvedMessage : getProblem();
    }

    public String getProblem() {
        return this.problem;
    }

    public boolean isSolved() {
        return this.solved;
    }

    public boolean solve(String attempt) {
        if (this.solution.equalsIgnoreCase(attempt))
            this.solved = true;
        return this.solved;
    }
}