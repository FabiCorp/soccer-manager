package com.manager.soccer.controller;

import com.manager.soccer.model.*;
import com.manager.soccer.repository.GameRepository;
import com.manager.soccer.repository.PlayerRepository;
import com.manager.soccer.repository.TeamRepository;
import com.manager.soccer.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    private PlayerRepository playerRepository;
    private TeamRepository teamRepository;
    private GameRepository gameRepository;
    private TrainerRepository trainerRepository;

    @Autowired
    public Controller(PlayerRepository playerRepository, TeamRepository teamRepository, GameRepository gameRepository, TrainerRepository trainerRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
        this.gameRepository = gameRepository;
    }

    @GetMapping(value = "players")
    public ResponseEntity<List<Player>> getAllPlayers() {
        playerRepository.save(new Player("Bla", "Bla", Position.DEFENDER));
        return ResponseEntity.ok(playerRepository.findAll());
    }

    @GetMapping(value = "player")
    public ResponseEntity<Player> getPlayerById(@RequestParam String id) {
        return ResponseEntity.ok(playerRepository.getPlayerById(id));
    }

    @GetMapping(value = "team")
    public ResponseEntity<Team> getTeamById(@RequestParam String id) {
        return ResponseEntity.ok(teamRepository.getTeamById(id));
    }

    @GetMapping(value = "games")
    public ResponseEntity<List<Game>> getAllGames() {
        return ResponseEntity.ok(gameRepository.findAll());
    }

    @GetMapping(value = "manager")
    public ResponseEntity<List<Trainer>> getAllTrainers() {
        return ResponseEntity.ok(trainerRepository.findAll());
    }

    @GetMapping(value = "/")
    public String forwardHTML() {
        return "forward://index.html";
    }


}


