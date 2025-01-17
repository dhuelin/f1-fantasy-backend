package com.dhuelin.f1.fantasy.backend.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "drivers")
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; // E.g., "Lewis Hamilton"

    @Column(nullable = false)
    private String team; // E.g., "Mercedes"

    @Column(nullable = false)
    private String nationality;
}
