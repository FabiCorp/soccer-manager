package com.manager.soccer.model.Actions;

import com.manager.soccer.model.Action;
import com.manager.soccer.model.Player;
import com.manager.soccer.model.Team;

public class Goal implements Action {
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


    @Override
    public int getTime() {
        return getMinute();
    }

    @Override
    public String getActionDescription() {
        return "And finally there it is. Goal for " + team.getName();
    }

    @Override
    public void makeAction() {

    }
}
