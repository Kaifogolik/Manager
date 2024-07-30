package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Team {
    private String team;
    private Player[] players;
    private int avgMmr;

    public Team(String team, Player[] players) {
        this.team = team;
        this.players = players;
        this.avgMmr = countAvaregeMmr();
    }


    private int countAvaregeMmr() {
        int counter = 0;
        for (Player player : players) {
            counter += player.getMmr();
        }
        return counter / players.length;
        //asdasdasdasd

    }

    public Player getPlayerWithMaxMmr() {
        //TODO здесь написать свой код
        return null;
    }
}
