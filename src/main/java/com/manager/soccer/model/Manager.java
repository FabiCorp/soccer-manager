package com.manager.soccer.model;

public class Manager {
    private int managerLevel;
    private int maxLevel;
    private String firstName;
    private String lastName;

    public Manager(int maxLevel, String firstName, String lastName) {
        this.managerLevel = 0;
        this.maxLevel = maxLevel;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setManagerLevel(int managerLevel) {
        this.managerLevel = managerLevel;
    }

    public int getManagerLevel() {
        return managerLevel;
    }

    public void decreaseManagerLevel() {
        if(this.managerLevel > 0) {
            managerLevel--;
        }
    }

    public void increaseManagerLevel() {
        if(this.managerLevel < maxLevel) {
            managerLevel++;
        }
    }
}
