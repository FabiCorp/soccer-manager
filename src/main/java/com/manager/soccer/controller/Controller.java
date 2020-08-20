package com.manager.soccer.controller;

import com.manager.soccer.model.Player;
import com.manager.soccer.model.Position;
import com.manager.soccer.model.Team;
import com.manager.soccer.repository.PlayerRepository;
import com.manager.soccer.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private PlayerRepository playerRepository;
    private TeamRepository teamRepository;

    @Autowired
    public Controller(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    @GetMapping(value = "players")
    public ResponseEntity<List<Player>> getAllPlayers() {
        playerRepository.save(new Player("Claire", "Tailer", Position.DEFENDER));
        return ResponseEntity.ok(playerRepository.findAll());
    }

    @GetMapping(value = "teams")
    public ResponseEntity<List<Team>> getAllTeams() {
        teamRepository.save(new Team("KSC", "Deutschland"));
        return ResponseEntity.ok(teamRepository.findAll());
    }



}


