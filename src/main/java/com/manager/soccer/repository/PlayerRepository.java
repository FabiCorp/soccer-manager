package com.manager.soccer.repository;

import com.manager.soccer.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player,String> {
    Player getPlayerById(String id);


    @Query(fields = "{'long_name':1, 'overall':1, 'potential':1, 'age':1, 'player_positions':1}")
    List<Player> findAllBy();
}


