package com.dhuelin.f1.fantasy.backend.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamDTO {
    private Long id;
    private String name;             // Team name, e.g., "Mercedes"
    private String country;          // Team country, e.g., "Germany"
    private int championshipsWon;    // Number of championships won
    private double currentPoints;       // Current season points
}
