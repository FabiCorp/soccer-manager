package com.manager.soccer.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Team {

    @Id
    private String id;

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
