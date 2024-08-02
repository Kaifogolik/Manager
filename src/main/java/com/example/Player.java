package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Player {
    private ArrayList<String> playerName;
    private ArrayList<String> rolePlayer;
    private ArrayList<Integer> mmr;
}
