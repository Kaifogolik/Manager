package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {


        Map<String, Team> teams = new HashMap<>();
        TeamRepositoryImpl teamRepository = new TeamRepositoryImpl(teams);

        teams.put("TeamSpirit", new Team("TeamSpirit", List.of(
                new Player("Raddan", "carry", 10000),
                new Player("Larl", "mid", 11000),
                new Player("Collapse", "offlane", 10500),
                new Player("Mira", "support", 9000),
                new Player("Miposhka", "support", 9500)
        )));

        teams.put("Gladiators", new Team("Gladiators", List.of(
                new Player("Dyrachyo", "carry", 12000),
                new Player("Quinn", "mid", 11500),
                new Player("Ace", "offlane", 11000),
                new Player("Tofu", "support", 8500),
                new Player("Seleri", "support", 9000)
        )));

        teams.put("NAVI", new Team("NAVI",   List.of(
                new Player("shigetsu", "carry", 10500),
                new Player("mellojul", "mid", 10200),
                new Player("nefrit", "offlane", 9800),
                new Player("daze", "support", 8700),
                new Player("Malady", "support", 9200)
        )));

        teams.put("LGD", new Team("LGD", List.of(
                new Player("shiro", "carry", 11000),
                new Player("Echo", "mid", 11200),
                new Player("niu", "offlane", 9900),
                new Player("Pyw", "support", 8200),
                new Player("y`", "support", 8800)
        )));

        Player testPlayer = teams.get(0).getPlayers().get(0);
        int i = testPlayer.hashCode();
        System.out.println(i);
 Object object;


    }




}







