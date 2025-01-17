package com.dhuelin.f1.fantasy.backend.persistence.repositories;

import com.dhuelin.f1.fantasy.backend.persistence.entities.RaceResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceResultRepository extends JpaRepository<RaceResultEntity, Long> {
}
