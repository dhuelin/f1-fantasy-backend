package com.dhuelin.f1.fantasy.backend.persistence.repositories;

import com.dhuelin.f1.fantasy.backend.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
