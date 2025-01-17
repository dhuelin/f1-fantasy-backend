package com.dhuelin.f1.fantasy.backend.controllers;

import com.dhuelin.f1.fantasy.backend.dtos.DriverDTO;
import com.dhuelin.f1.fantasy.backend.dtos.RaceDTO;
import com.dhuelin.f1.fantasy.backend.dtos.TeamDTO;
import com.dhuelin.f1.fantasy.backend.dtos.UserDTO;
import com.dhuelin.f1.fantasy.backend.services.DataRetrieverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BasicInfoController {

    @Autowired
    private DataRetrieverService dataRetrieverService;

    @GetMapping("/users")
    public List<UserDTO> getAllUsers() {
        return dataRetrieverService.getAllUsers();
    }

    @GetMapping("/drivers")
    public List<DriverDTO> getAllDrivers() {
        return dataRetrieverService.getAllDrivers();
    }

    @GetMapping("/races")
    public List<RaceDTO> getAllRaces() {
        return dataRetrieverService.getAllRaces();
    }

    @GetMapping("/teams")
    public List<TeamDTO> getAllTeams() {
        return dataRetrieverService.getAllTeams();
    }
}
