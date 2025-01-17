package com.dhuelin.f1.fantasy.backend.services;

import com.dhuelin.f1.fantasy.backend.dtos.DriverDTO;
import com.dhuelin.f1.fantasy.backend.dtos.RaceDTO;
import com.dhuelin.f1.fantasy.backend.dtos.TeamDTO;
import com.dhuelin.f1.fantasy.backend.dtos.UserDTO;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.DriverRepository;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.RaceRepository;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.TeamRepository;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.UserRepository;
import com.dhuelin.f1.fantasy.backend.services.mappers.DriverMapper;
import com.dhuelin.f1.fantasy.backend.services.mappers.RaceMapper;
import com.dhuelin.f1.fantasy.backend.services.mappers.TeamMapper;
import com.dhuelin.f1.fantasy.backend.services.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataRetrieverService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private RaceRepository raceRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DriverMapper driverMapper;

    @Autowired
    private RaceMapper raceMapper;

    @Autowired
    private TeamMapper teamMapper;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                             .stream()
                             .map(userMapper::toDTO)
                             .collect(Collectors.toList());
    }

    public List<DriverDTO> getAllDrivers() {
        return driverRepository.findAll()
                               .stream()
                               .map(driverMapper::toDTO)
                               .collect(Collectors.toList());
    }

    public List<RaceDTO> getAllRaces() {
        return raceRepository.findAll()
                             .stream()
                             .map(raceMapper::toDTO)
                             .collect(Collectors.toList());
    }

    public List<TeamDTO> getAllTeams() {
        return teamRepository.findAll()
                             .stream()
                             .map(teamMapper::toDTO)
                             .collect(Collectors.toList());
    }
}
