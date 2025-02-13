package com.dhuelin.f1.fantasy.backend.controllers;

import com.dhuelin.f1.fantasy.backend.dtos.DriverDTO;
import com.dhuelin.f1.fantasy.backend.dtos.RaceDTO;
import com.dhuelin.f1.fantasy.backend.dtos.TeamDTO;
import com.dhuelin.f1.fantasy.backend.dtos.UserDTO;
import com.dhuelin.f1.fantasy.backend.services.DataRetrieverService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import java.time.LocalDate;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class BasicInfoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private DataRetrieverService dataRetrieverService;

    @Test
    void getAllUsers_ShouldReturnUserList() throws Exception {
        UserDTO userDTO = new UserDTO("user1", "user1@example.com", 0);
        when(dataRetrieverService.getAllUsers()).thenReturn(List.of(userDTO));

        mockMvc.perform(get("/api/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].username", is("user1")));
    }

    @Test
    void getAllDrivers_ShouldReturnDriverList() throws Exception {
        DriverDTO driverDTO = new DriverDTO(1l, "driver1", "team1", "CH");
        when(dataRetrieverService.getAllDrivers()).thenReturn(List.of(driverDTO));

        mockMvc.perform(get("/api/drivers"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is("driver1")));
    }

    @Test
    void getAllRaces_ShouldReturnRaceList() throws Exception {
        RaceDTO raceDTO = new RaceDTO(1l, "race1", "location1", LocalDate.now());
        when(dataRetrieverService.getAllRaces()).thenReturn(List.of(raceDTO));

        mockMvc.perform(get("/api/races"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is("race1")));
    }

    @Test
    void getAllTeams_ShouldReturnTeamList() throws Exception {
        TeamDTO teamDTO = new TeamDTO(1l, "team1", "country1", 10, 158.5);
        when(dataRetrieverService.getAllTeams()).thenReturn(List.of(teamDTO));

        mockMvc.perform(get("/api/teams"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is("team1")));
    }
}