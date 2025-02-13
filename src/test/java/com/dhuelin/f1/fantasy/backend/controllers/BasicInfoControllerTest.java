package com.dhuelin.f1.fantasy.backend.controllers;

import com.dhuelin.f1.fantasy.backend.integrationtests.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class BasicInfoControllerTest extends IntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAllUsers_ShouldReturnUserList() throws Exception {
        mockMvc.perform(get("/api/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].username", is("user1")));
    }

    @Test
    void getAllDrivers_ShouldReturnDriverList() throws Exception {
        mockMvc.perform(get("/api/drivers"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is("driver1")));
    }

    @Test
    void getAllRaces_ShouldReturnRaceList() throws Exception {
        mockMvc.perform(get("/api/races"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is("race1")));
    }

    @Test
    void getAllTeams_ShouldReturnTeamList() throws Exception {
        mockMvc.perform(get("/api/teams"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is("team1")));
    }
}
