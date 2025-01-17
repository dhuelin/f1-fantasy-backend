package com.dhuelin.f1.fantasy.backend.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "race_results")
public class RaceResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "race_id", nullable = false)
    private RaceEntity raceEntity;

    @ManyToMany
    @JoinTable(
        name = "race_result_top10",
        joinColumns = @JoinColumn(name = "race_result_id"),
        inverseJoinColumns = @JoinColumn(name = "driver_id")
    )
    private List<DriverEntity> top10DriverEntities; // Ordered list of drivers finishing in the top 10

    @ManyToOne
    @JoinColumn(name = "fastest_lap_driver_id")
    private DriverEntity fastestLapDriverEntity;

    @ManyToOne
    @JoinColumn(name = "driver_of_the_day_id")
    private DriverEntity driverEntityOfTheDay;

    @ManyToMany
    @JoinTable(
        name = "race_result_dnfs",
        joinColumns = @JoinColumn(name = "race_result_id"),
        inverseJoinColumns = @JoinColumn(name = "driver_id")
    )
    private List<DriverEntity> dnfs; // List of drivers who did not finish
}
