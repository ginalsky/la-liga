package com.project.laliga.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    @GetMapping("/names")
    public ArrayList<String> getTeamsNames(){
        ArrayList<String> teamsNames = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            teamsNames.add(teamService.getTeamByTeamId(i).getTeamName());
        }
        return teamsNames;
    }

}
