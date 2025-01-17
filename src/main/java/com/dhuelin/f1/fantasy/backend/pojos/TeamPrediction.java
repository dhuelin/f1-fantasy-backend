package com.dhuelin.f1.fantasy.backend.pojos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamPrediction {
    private Long id;
    private User user;
    private Race race;
    private Team topTeam;
}
