package com.dhuelin.f1.fantasy.backend.pojos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Race {
    private Long id;
    private String name; // E.g., "Australian Grand Prix"
    private String location;
    private LocalDate date;
}
