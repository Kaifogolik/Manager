package com.example;

import java.util.Queue;
import java.util.Stack;

public interface TeamRepository {
    Team findTeamByTeamName(String teamName);
    Team findTeamByPlayerName(String playerName);
    Player findPlayerByName(String playerName);
    Team findTeamWithMaxAvgMmr();
    void sortTeamsBuyAvgMmr();
    Queue<Team> getMatchQueue();
    Stack<Team> getChangeStack();

}

