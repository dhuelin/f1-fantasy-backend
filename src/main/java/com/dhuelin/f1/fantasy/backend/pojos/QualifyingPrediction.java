package com.dhuelin.f1.fantasy.backend.pojos;

import com.dhuelin.f1.fantasy.backend.Driver;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QualifyingPrediction {
    private Long id;
    private User user;
    private Race race;
    private Driver polePositionDriver;
}
