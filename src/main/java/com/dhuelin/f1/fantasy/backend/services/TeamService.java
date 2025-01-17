package com.dhuelin.f1.fantasy.backend.services;

import com.dhuelin.f1.fantasy.backend.dtos.TeamDTO;
import com.dhuelin.f1.fantasy.backend.persistence.entities.TeamEntity;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.TeamRepository;
import com.dhuelin.f1.fantasy.backend.pojos.Team;
import com.dhuelin.f1.fantasy.backend.services.mappers.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamMapper teamMapper;

    @Autowired
    private TeamRepository teamRepository;

    public TeamDTO getTeamById(Long id) {
        TeamEntity teamEntity = teamRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Team not found"));
        return teamMapper.toDTO(teamEntity);
    }

    public void saveTeam(Team team) {
        TeamEntity teamEntity = teamMapper.toEntity(team);
        teamRepository.save(teamEntity);
    }
}
