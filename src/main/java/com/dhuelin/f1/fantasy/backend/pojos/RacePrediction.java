package com.dhuelin.f1.fantasy.backend.pojos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RacePrediction {
    private Long id;
    private User user;
    private Race race;
    private List<Driver> top10Drivers;
    private Driver fastestLapDriver;
    private Driver driverOfTheDay;
    private List<Driver> dnfs;
    private boolean boostUsed;
}
