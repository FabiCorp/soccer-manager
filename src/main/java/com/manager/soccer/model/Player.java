package com.manager.soccer.model;

import org.springframework.data.annotation.Id;

public class Player {

    @Id
    private String id;

    private String long_name;
    private int overall;
    private int potential;
    private int age;

    public Player(String long_name, int overall, int potential, int age, String player_positions) {
        this.long_name = long_name;
        this.overall = overall;
        this.potential = potential;
        this.age = age;
        this.player_positions = player_positions;
    }



    public String getId() {
        return id;
    }

    public String getLong_name() {
        return long_name;
    }

    public int getOverall() {
        return overall;
    }

    public int getPotential() {
        return potential;
    }

    public int getAge() {
        return age;
    }

    public String getPlayer_positions() {
        return player_positions;
    }

    private String player_positions;
}
