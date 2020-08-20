package com.manager.soccer.model;



public class Player {
    private String firstName;
    private String lastName;
    private Position position;

    public Player(String firstName, String lastName, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

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
