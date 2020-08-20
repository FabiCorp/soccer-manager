package com.manager.soccer.model;

public class Goal {
    private int minute;
    private Player scorer;
    private Team team;

    public Goal(int minute, Player scorer, Team team) {
        this.minute = minute;
        this.scorer = scorer;
        this.team = team;
    }

    public int getMinute() {
        return minute;
    }

    public Player getScorer() {
        return scorer;
    }

    public Team getTeam() {
        return team;
    }
}
