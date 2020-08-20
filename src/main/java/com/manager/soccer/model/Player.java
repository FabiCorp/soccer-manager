package com.manager.soccer.model;

import org.springframework.data.annotation.Id;

public class Player {

    @Id
    private String id;
    
    private String firstName;
    private String lastName;
    private Position position;

    public Player(String firstName, String lastName, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getId() { return id; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }
}
