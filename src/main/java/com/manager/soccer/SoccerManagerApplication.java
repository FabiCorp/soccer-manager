package com.manager.soccer;

import com.manager.soccer.model.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SoccerManagerApplication {

	public static void main(String[] args) {
		SoccerManagerApplication.fabiTestetFleissig();

		//SpringApplication.run(SoccerManagerApplication.class, args);
	}


	public static void fabiTestetFleissig() {
		Player player1 = new Player("Fabian Walter Frank", 94, 95, 22, "Striker");
		Player player2 = new Player("Fabian Jonathan Wenzel", 43, 44, 23, "Striker");
		List<Player> playerList = new ArrayList<Player>();
		playerList.add(player1);
		playerList.add(player2);
		Team homies = new Team("FC Bayern", "Deutschland", playerList);
		Team awayies = new Team("Paris Saint Germain", "Frankreich", playerList);
		Game game = new Game(homies, awayies);
		game.simulateGame();
		List<Action> act = game.getActions();
		for(int i = 0; i < act.size(); i++) {
			System.out.println(act.get(i).getTime());
			System.out.println(act.get(i).getActionDescription());
		}
		Scheduler.scheduler(11);
	}

}
