package com.dhuelin.f1.fantasy.backend.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RaceDTO {
    private Long id;
    private String name;       // Race name, e.g., "Australian Grand Prix"
    private String location;   // Location, e.g., "Melbourne"
    private LocalDate date;    // Race date
}
