package com.dhuelin.f1.fantasy.backend.services.mappers;

import com.dhuelin.f1.fantasy.backend.dtos.DriverDTO;
import com.dhuelin.f1.fantasy.backend.persistence.entities.DriverEntity;
import org.springframework.stereotype.Component;

@Component
public class DriverMapper {

    public DriverDTO toDTO(DriverEntity entity) {
        if (entity == null) {
            return null;
        }
        return new DriverDTO(
            entity.getId(),
            entity.getName(),
            entity.getTeam(),
            entity.getNationality()
        );
    }

    public DriverEntity toEntity(DriverDTO dto) {
        if (dto == null) {
            return null;
        }
        DriverEntity entity = new DriverEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setTeam(dto.getTeam());
        entity.setNationality(dto.getNationality());
        return entity;
    }
}
