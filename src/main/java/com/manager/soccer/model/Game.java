package com.manager.soccer.model;

import com.manager.soccer.model.Actions.Goal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Weather weather;
    private int fanAttendance;
    private Stadium stadium;
    private List<Action> actions;
    private double parameter = 0.03;
    private double homeTeamGoalProb;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.actions = new ArrayList<Action>();
        this.homeTeamGoalProb = 0.5;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Weather getWeather() {
        return weather;
    }

    public int getFanAttendance() {
        return fanAttendance;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void simulateGame() {
        int time = 1 + (int) getNext(getParameter());

        while(time < 90) {
            newGoal(time);
            time += (int) (getNext(getParameter()));
        }
    }

    public double getParameter() {
        return parameter;
    }

    public double getNext(double value) {
        Random rand = new Random();
        return  Math.log(1-rand.nextDouble())/(-value);
    }

    private void newGoal(int time) {
        Random random = new Random();
        if(random.nextDouble() < this.homeTeamGoalProb) {
            actions.add(new Goal(time, null, homeTeam));
        }
        else {
            actions.add(new Goal(time, null, awayTeam));
        }

    }

    private void newYellowCard(int time) {

    }
}
