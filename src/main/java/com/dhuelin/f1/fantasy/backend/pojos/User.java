package com.dhuelin.f1.fantasy.backend.pojos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private int boostChipUsed; // Tracks if the user has used their boost chip for the season
}
