package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@Getter
@AllArgsConstructor
@Log4j
public class TeamRepositoryImpl implements TeamRepository {

    Team[] teams;

    @Override
    public Team findTeamByTeamName(String teamName) {
        for (Team team1 : teams) {
            String name1 = team1.getTeam();
            if (teamName.equals(name1)) {
                return team1;
            }
        }
        log.info("Ничего не найдено");
        return null;
    }

    @Override
    public Team findTeamByPlayerName(String playerName) {
        for (Team team : teams) {
            Player[] players = team.getPlayers();
            for (Player player : players) {
                if (playerName.equals(player.getPlayerName())) {
                    return team;
                }
            }

        }

        log.info("Ничего не найдено");
        return null;
    }

    @Override
    public Player findPlayerByName(String playerName) {
        for (Team team : teams) {
            Player[] players = team.getPlayers();
            for (Player player : players) {
                if (playerName.equals(player.getPlayerName())) {
                    return player;
                }

            }


        }

        return null;
    }

}

