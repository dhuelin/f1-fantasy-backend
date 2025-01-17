package com.dhuelin.f1.fantasy.backend.persistence.repositories;

import com.dhuelin.f1.fantasy.backend.persistence.entities.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
}
