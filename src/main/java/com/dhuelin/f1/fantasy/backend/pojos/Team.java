package com.dhuelin.f1.fantasy.backend.pojos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    private Long id;
    private String name;
    private String country;
    private int championshipsWon;
    private int currentPoints;
}
