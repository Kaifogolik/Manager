package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TeamRepositoryImpl teamRepository;
        teamRepository = new TeamRepositoryImpl(new Team[5]);
        Team[] team = teamRepository.getTeams();
        team[0] = new Team("TeamSpirit", new Player[]{
                new Player("Raddan", "carry", 10000),
                new Player("Larl", "mid", 11000),
                new Player("Collapse", "offlane", 10500),
                new Player("Mira", "support", 9000),
                new Player("Miposhka", "support", 9500)
        });

        team[1] = new Team("Gladiators", new Player[]{
                new Player("Dyrachyo", "carry", 12000),
                new Player("Quinn", "mid", 11500),
                new Player("Ace", "offlane", 11000),
                new Player("Tofu", "support", 8500),
                new Player("Seleri", "support", 9000)
        });

        team[2] = new Team("NAVI", new Player[]{
                new Player("shigetsu", "carry", 10500),
                new Player("mellojul", "mid", 10200),
                new Player("nefrit", "offlane", 9800),
                new Player("daze", "support", 8700),
                new Player("Malady", "support", 9200)
        });

        team[3] = new Team("LGD", new Player[]{
                new Player("shiro", "carry", 11000),
                new Player("Echo", "mid", 11200),
                new Player("niu", "offlane", 9900),
                new Player("Pyw", "support", 8200),
                new Player("y`", "support", 8800)
        });

        System.out.println(teamRepository.gamerSearch("Ace"));
    }


}





