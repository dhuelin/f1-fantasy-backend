package com.dhuelin.f1.fantasy.backend.persistence.repositories;

import com.dhuelin.f1.fantasy.backend.persistence.entities.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<DriverEntity, Long> {
}
