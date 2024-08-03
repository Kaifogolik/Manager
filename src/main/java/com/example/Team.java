package com.example;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class Team {
    private String teamName;
    private ArrayList<Player> players;
    @Getter
    private int avgMmr;

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = (ArrayList<Player>) players;
        this.avgMmr = countAverageMmr();
    }

    private int countAverageMmr() {
        int counter = 0;
        for (Player player : players) {
            counter += player.getMmr();
        }
        return players.size() > 0 ? counter / players.size() : 0;
    }

    public Player getPlayerWithMaxMmr() {
        // TODO Здесь написать свой код игрока с макс ммр
        int maxMmr = 0;
        Player maxPlayer = null;
        for (Player player : players) {
            if (player.getMmr() > maxMmr) {
                maxMmr = player.getMmr();
                maxPlayer = player;
            }
        }
        return maxPlayer;
    }

}
