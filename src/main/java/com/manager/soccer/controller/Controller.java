package com.manager.soccer.controller;

import com.manager.soccer.model.Player;
import com.manager.soccer.model.Position;
import com.manager.soccer.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private PlayerRepository playerRepository;

    @Autowired
    public Controller(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping(value = "players")
    public ResponseEntity<List<Player>> getAllPlayers() {
        playerRepository.save(new Player("Claire", "Tailer", Position.DEFENDER));
        return ResponseEntity.ok(playerRepository.findAll());
    }



}


