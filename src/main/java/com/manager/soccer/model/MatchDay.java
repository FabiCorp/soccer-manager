package com.manager.soccer.model;

import java.util.List;

public class MatchDay {
    private List<Game> games;
    private boolean simulated = false;

    public void simulateMatchDay() {
        if(!simulated) {
            simulateMatches();
            simulated = true;
        }
    }

    private void simulateMatches() {
        for(Game game: games) {
            game.simulateGame();
        }
    }

    public List<Game> getGames() {
        return games;
    }
}
