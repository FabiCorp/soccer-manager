package com.manager.soccer.model;

public class Stadium {
    private String name;
    private int stadiumLevel;
    private int capacityHighPrice;
    private int capacityMiddlePrice;
    private int capacityLowPrice;
    private int highPriceCost;
    private int middlePriceCost;
    private int lowPriceCost;

    public Stadium(String name, int stadiumLevel, int capacityHighPrice, int capacityMiddlePrice, int capacityLowPrice, int highPriceCost, int middlePriceCost, int lowPriceCost) {
        this.name = name;
        this.stadiumLevel = stadiumLevel;
        this.capacityHighPrice = capacityHighPrice;
        this.capacityMiddlePrice = capacityMiddlePrice;
        this.capacityLowPrice = capacityLowPrice;
        this.highPriceCost = highPriceCost;
        this.middlePriceCost = middlePriceCost;
        this.lowPriceCost = lowPriceCost;
    }

    public String getName() {
        return name;
    }

    public int getStadiumLevel() {
        return stadiumLevel;
    }

    public int getCapacityHighPrice() {
        return capacityHighPrice;
    }

    public int getCapacityMiddlePrice() {
        return capacityMiddlePrice;
    }

    public int getCapacityLowPrice() {
        return capacityLowPrice;
    }

    public int getHighPriceCost() {
        return highPriceCost;
    }

    public int getMiddlePriceCost() {
        return middlePriceCost;
    }

    public int getLowPriceCost() {
        return lowPriceCost;
    }


    public int getStadiumCapacity() {
        return capacityHighPrice + capacityMiddlePrice + capacityLowPrice;
    }


}
