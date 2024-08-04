package com.example;

public interface TeamRepository {
    Team findTeamByTeamName(String teamName);
    Team findTeamByPlayerName(String playerName);
    Player findPlayerByName(String playerName);
    Team findTeamWithMaxAvgMmr();
    void sortTeamsBuyAvgMmr();

}

