package com.manager.soccer.repository;

import com.manager.soccer.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player,String> {

}


