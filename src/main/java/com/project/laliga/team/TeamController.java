package com.project.laliga.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "teams")
public class TeamController {
    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }
    @GetMapping("/{teamId}")
    public Team getTeam(@PathVariable Integer teamId) {
        return teamService.getTeamByTeamId(teamId);
    }
    @GetMapping("/name/{teamId}")
    public String getTeamNameByTeamId(@PathVariable Integer teamId) {
        return teamService.getTeamByTeamId(teamId).getTeamName();
    }

}
