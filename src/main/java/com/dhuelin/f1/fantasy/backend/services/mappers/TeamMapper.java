package com.dhuelin.f1.fantasy.backend.services.mappers;

import com.dhuelin.f1.fantasy.backend.dtos.TeamDTO;
import com.dhuelin.f1.fantasy.backend.persistence.entities.TeamEntity;
import com.dhuelin.f1.fantasy.backend.pojos.Team;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {

    public TeamDTO toDTO(TeamEntity entity) {
        return new TeamDTO(
            entity.getId(),
            entity.getName(),
            entity.getCountry(),
            entity.getChampionshipsWon(),
            entity.getCurrentPoints()
        );
    }

    public TeamEntity toEntity(Team pojo) {
        TeamEntity entity = new TeamEntity();
        entity.setId(pojo.getId());
        entity.setName(pojo.getName());
        entity.setCountry(pojo.getCountry());
        entity.setChampionshipsWon(pojo.getChampionshipsWon());
        entity.setCurrentPoints(pojo.getCurrentPoints());
        return entity;
    }
}
