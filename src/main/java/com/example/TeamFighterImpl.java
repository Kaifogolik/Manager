package com.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TeamFighterImpl implements TeamFighter {

    private TeamRepository teamRepository;


    @Override
    public void fight() {
        //TODO реализовать метод. Побеждает команда с большим средним ммр.
    }
}
