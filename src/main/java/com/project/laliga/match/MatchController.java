package com.project.laliga.match;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/matches")
public class MatchController {
    private final MatchService matchService;
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
    @GetMapping
    public List<Match> getMatches() {
        return matchService.findAllMatches();
    }
}
