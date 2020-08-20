package com.manager.soccer.model;

import java.util.List;

public class Team {
    private String name;

    public Team(String name, String country) {
        this.name = name;
        this.country = country;
        //this.players = players;
    }

    private String country;
    //private List<Player> players;
}
