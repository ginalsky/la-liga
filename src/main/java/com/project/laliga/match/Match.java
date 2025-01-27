package com.project.laliga.match;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.project.laliga.team.Team;
import jakarta.persistence.*;

@Entity
@Table(name = "matches")
public class Match {
    @Column(name = "match_date")
    private LocalDate matchDate;
    @Column(name = "full_time_home_goals")
    private int fullTimeHomeGoals;
    @Column(name = "full_time_away_goals")
    private int fullTimeAwayGoals;
    @Column(name = "full_time_result")
    private String fullTimeResult;
    @Column(name = "half_time_home_goals")
    private int halfTimeHomeGoals;
    @Column(name = "half_time_away_goals")
    private int halfTimeAwayGoals;
    @Column(name = "half_time_result")
    private String halfTimeResult;
    @ManyToOne
    @JoinColumn(name = "home_team_id", referencedColumnName = "team_id")
    private Team homeTeam;
    @ManyToOne
    @JoinColumn(name = "away_team_id", referencedColumnName = "team_id")
    private Team awayTeam;

    public Match() {
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public int getFullTimeHomeGoals() {
        return fullTimeHomeGoals;
    }

    public void setFullTimeHomeGoals(int fullTimeHomeGoals) {
        this.fullTimeHomeGoals = fullTimeHomeGoals;
    }

    public int getFullTimeAwayGoals() {
        return fullTimeAwayGoals;
    }

    public void setFullTimeAwayGoals(int fullTimeAwayGoals) {
        this.fullTimeAwayGoals = fullTimeAwayGoals;
    }

    public String getFullTimeResult() {
        return fullTimeResult;
    }

    public void setFullTimeResult(String fullTimeResult) {
        this.fullTimeResult = fullTimeResult;
    }

    public int getHalfTimeHomeGoals() {
        return halfTimeHomeGoals;
    }

    public void setHalfTimeHomeGoals(int halfTimeHomeGoals) {
        this.halfTimeHomeGoals = halfTimeHomeGoals;
    }

    public int getHalfTimeAwayGoals() {
        return halfTimeAwayGoals;
    }

    public void setHalfTimeAwayGoals(int halfTimeAwayGoals) {
        this.halfTimeAwayGoals = halfTimeAwayGoals;
    }

    public String getHalfTimeResult() {
        return halfTimeResult;
    }

    public void setHalfTimeResult(String halfTimeResult) {
        this.halfTimeResult = halfTimeResult;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
}
