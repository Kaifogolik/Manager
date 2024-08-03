package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Getter
@AllArgsConstructor
@Log4j
public class TeamRepositoryImpl implements TeamRepository {

    List<Team> teams;

    @Override
    public List<Player> findTeamByTeamName(String teamName) {
        for (Team team1 : teams) {
            ArrayList<String> name1 = team1.getTeamName();
        }
        log.info("Ничего не найдено");
        return null;
    }

    @Override
    public List<Team> findTeamByPlayerName(String playerName) {
        for (Team team : teams) {
            ArrayList<Player> players = team.getPlayers();
            for (Player player : players) {
            }

        }

        log.info("Ничего не найдено");
        return null;
    }

    @Override
    public Player findPlayerByName(String playerName) {
        for (Team team : teams) {
            ArrayList<Player> players = team.getPlayers();
            for (Player player : players) {
            }
        }

        return null;
    }
    @Override
    public Team findTeamWithMaxAvgMmr() {
        Team teamMvp = null;
        int mvpMmr = 0;
        for (Team team : teams) {
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
        Arrays.sort(teams.toArray(new Team[0]), Comparator.comparingInt(Team::getAvgMmr));
    }

    public boolean isSorted() {
        for (int i = 0; i < teams.size() - 1; i++) {
            if (teams.get(i).getAvgMmr() > teams.get(i + 1).getAvgMmr()) {
                return false;
            }
        }
        return true;
    }
}

