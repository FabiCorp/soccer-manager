package com.manager.soccer.model;

import java.util.List;
import java.util.Random;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Weather weather;
    private int fanAttendance;
    private Stadium stadium;
    private List<Goal> goals;


    public void simulateGame() {
        Random random = new Random();
        int time = (int) getNext(getParameter());

        while(time < 90) {
            if(random.nextDouble() > 0.5) {
                goals.add(new Goal(time, null, homeTeam));
            }
            else {
                goals.add(new Goal(time, null, awayTeam));
            }
        }
        System.out.println(goals.size());
        System.out.println("heyo was geht TESTVERSION1");
    }

    public double getParameter() {
        return 40;
    }

    public double getNext(double value) {
        Random rand = new Random();
        return  Math.log(1-rand.nextDouble())/(-value);
    }
}
