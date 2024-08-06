package com.example;

import java.util.List;

public interface RosterChanger {


    void applyChanges(Team team);
    void createTeamRosterChange(String teamName, List<Player> oldPlayers, List<Player> newPlayers);
}
