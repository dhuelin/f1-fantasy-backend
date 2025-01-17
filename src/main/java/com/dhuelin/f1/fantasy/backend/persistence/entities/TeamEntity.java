package com.dhuelin.f1.fantasy.backend.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teams")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // E.g., "Mercedes"

    @Column(nullable = false)
    private String country; // E.g., "Germany"

    @Column(nullable = false)
    private int championshipsWon; // Number of championships the team has won

    @Column(nullable = false)
    private int currentPoints; // Current season points
}
