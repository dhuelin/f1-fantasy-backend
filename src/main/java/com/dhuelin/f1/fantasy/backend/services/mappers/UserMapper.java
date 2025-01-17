package com.dhuelin.f1.fantasy.backend.services.mappers;

import com.dhuelin.f1.fantasy.backend.dtos.UserDTO;
import com.dhuelin.f1.fantasy.backend.persistence.entities.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    public UserDTO toDTO(UserEntity entity) {
        return new UserDTO(entity.getUsername(), entity.getEmail(), entity.getBoostChipUsed());
    }

    public UserEntity toEntity(UserDTO dto) {
        UserEntity entity = new UserEntity();
        entity.setUsername(dto.getUsername());
        entity.setEmail(dto.getEmail());
        entity.setBoostChipUsed(dto.getBoostChipUsed());
        return entity;
    }
}
