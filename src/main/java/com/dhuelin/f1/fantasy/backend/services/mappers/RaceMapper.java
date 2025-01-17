package com.dhuelin.f1.fantasy.backend.services.mappers;

import com.dhuelin.f1.fantasy.backend.dtos.RaceDTO;
import com.dhuelin.f1.fantasy.backend.persistence.entities.RaceEntity;
import org.springframework.stereotype.Component;

@Component
public class RaceMapper {

    public RaceDTO toDTO(RaceEntity entity) {
        if (entity == null) {
            return null;
        }
        return new RaceDTO(
            entity.getId(),
            entity.getName(),
            entity.getLocation(),
            entity.getDate()
        );
    }

    public RaceEntity toEntity(RaceDTO dto) {
        if (dto == null) {
            return null;
        }
        RaceEntity entity = new RaceEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setLocation(dto.getLocation());
        entity.setDate(dto.getDate());
        return entity;
    }
}
