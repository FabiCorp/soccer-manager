package com.manager.soccer.model.Actions;

import com.manager.soccer.model.Action;
import com.manager.soccer.model.Player;
import com.manager.soccer.model.Team;

public class YellowCard implements Action {
    private int minute;
    private Player penaltyCauser;
    private Team team;

    public YellowCard(int minute, Player penaltyCauser, Team team) {
        this.minute = minute;
        this.penaltyCauser = penaltyCauser;
        this.team = team;
    }

    public int getMinute() {
        return minute;
    }

    public Player getPenaltyCauser() {
        return penaltyCauser;
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
        return "Another yellow card for" + team.getName();
    }

    @Override
    public void makeAction() {

    }
}
