package com.project.laliga.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private final TeamRepository teamRepository;
    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
    public Team getTeamByTeamId(int teamId) {
        return teamRepository.getTeamByTeamId(teamId);
    }
}
