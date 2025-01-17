package com.dhuelin.f1.fantasy.backend.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDTO {
    private Long id;
    private String name;       // Driver's name, e.g., "Lewis Hamilton"
    private String team;       // Team name, e.g., "Mercedes"
    private String nationality; // Driver's nationality, e.g., "British"
}
