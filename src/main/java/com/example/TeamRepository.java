package com.example;

import java.util.List;

public interface TeamRepository {
    List<Player> findTeamByTeamName(String teamName);
    List<Team> findTeamByPlayerName(String playerName);
    Player findPlayerByName(String playerName);
    Team findTeamWithMaxAvgMmr();
    void sortTeamsBuyAvgMmr();
}

