package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j;

import java.util.*;

@Getter
@AllArgsConstructor
@Log4j
public class TeamRepositoryImpl implements TeamRepository {

    Map<String, Team> teams;
    private Queue<Team> matchQueue;
    private Stack<Team> changeStack;

    @Override
    public Team findTeamByTeamName(String teamName) {
        return teams.get(teamName);
    }

    @Override
    public Team findTeamByPlayerName(String playerName) {
        for (Team team : teams.values()) {
            List<Player> players = team.getPlayers();
            for (Player player : players) {
                if (player.getPlayerName() == playerName) {
                    return team;
                }
            }
        }
        log.info("Ничего не найдено");
        return null;
    }

    @Override
    public Player findPlayerByName(String playerName) {
        for (Team team : teams.values()) {
            List<Player> players = team.getPlayers();
            for (Player player : players) {
                if (player.getPlayerName() == playerName) {
                    return player;
                }
            }
        }
        return null;
    }

    @Override
    public Team findTeamWithMaxAvgMmr() {
        Team teamMvp = null;
        int mvpMmr = 0;
        for (Team team : teams.values()) {
            if (team.getAvgMmr() > mvpMmr) {
                mvpMmr = team.getAvgMmr();
                teamMvp = team;
                log.info(teamMvp.toString());
            }
        }
        return teamMvp;
    }

    @Override
    public void sortTeamsBuyAvgMmr() {
        Arrays.sort(teams.values().toArray(new Team[0]), Comparator.comparingInt(Team::getAvgMmr));
    }



    public Team getNextTeamQueue() {
        return matchQueue.poll();
    }

    public void changeAdd(Team change) {
        Stack<Team> changeStack = new Stack<>();
        changeStack.push(change);
    }

    public String getLastChange() {
        if (!changeStack.isEmpty()) {
            return String.valueOf(changeStack.pop());
        } else {
            return null;
        }
    }

}

