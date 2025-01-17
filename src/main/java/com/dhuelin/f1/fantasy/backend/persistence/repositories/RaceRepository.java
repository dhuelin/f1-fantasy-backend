package com.dhuelin.f1.fantasy.backend.persistence.repositories;

import com.dhuelin.f1.fantasy.backend.persistence.entities.RaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<RaceEntity, Long> {
}
