package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Player {
    private String playerName;
    private String rolePlayer;
    private Integer mmr;
}
