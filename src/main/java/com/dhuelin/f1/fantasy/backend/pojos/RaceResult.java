package com.dhuelin.f1.fantasy.backend.pojos;

import com.dhuelin.f1.fantasy.backend.Driver;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RaceResult {
    private Long id;
    private Race race;
    private List<Driver> top10Drivers; // Ordered list of drivers finishing in the top 10
    private Driver fastestLapDriver;
    private Driver driverOfTheDay;
    private List<Driver> dnfs; // List of drivers who did not finish
}
