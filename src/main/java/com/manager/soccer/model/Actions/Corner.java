package com.manager.soccer.model.Actions;

import com.manager.soccer.model.Action;
import com.manager.soccer.model.Player;
import com.manager.soccer.model.Team;

public class Corner implements Action {
    private int minute;
    private Player cornerTaker;
    private Team team;

    public Corner(int minute, Player cornerTaker, Team team) {
        this.minute = minute;
        this.cornerTaker = cornerTaker;
        this.team = team;
    }

    public int getMinute() {
        return minute;
    }

    public Player getScorer() {
        return cornerTaker;
    }

    public Team getTeam() {
        return team;
    }

    @Override
    public int getTime() {
        return getMinute();
    }

    @Override
    public String getActionDescription() {
        return "Corner for" + team.getName();
    }

    @Override
    public void makeAction() {

    }
}
