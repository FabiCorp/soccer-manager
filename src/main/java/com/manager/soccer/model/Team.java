package com.manager.soccer.model;

import java.util.List;

public class Team {
    private String name;
    private String country;
    private List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Team(String name, String country, List<Player> players) {
        this.name = name;
        this.country = country;
        this.players = players;
    }

}
