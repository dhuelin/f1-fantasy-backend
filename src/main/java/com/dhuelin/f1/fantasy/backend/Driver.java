package com.dhuelin.f1.fantasy.backend;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {
    private Long id;
    private String name; // E.g., "Lewis Hamilton"
    private String team; // E.g., "Mercedes"
    private String nationality;
}
