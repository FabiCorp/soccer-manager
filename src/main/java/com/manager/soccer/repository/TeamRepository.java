package com.manager.soccer.repository;

import com.manager.soccer.model.Player;
import com.manager.soccer.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {
    Team getTeamById(String id);

}