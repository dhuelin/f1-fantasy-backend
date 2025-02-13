package com.dhuelin.f1.fantasy.backend.integrationtests;

import com.dhuelin.f1.fantasy.backend.persistence.entities.DriverEntity;
import com.dhuelin.f1.fantasy.backend.persistence.entities.RaceEntity;
import com.dhuelin.f1.fantasy.backend.persistence.entities.TeamEntity;
import com.dhuelin.f1.fantasy.backend.persistence.entities.UserEntity;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.DriverRepository;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.RaceRepository;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.TeamRepository;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class IntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private RaceRepository raceRepository;

    @Autowired
    private TeamRepository teamRepository;

    @BeforeEach
    void setUp() {
        // Clear existing data
        userRepository.deleteAll();
        driverRepository.deleteAll();
        raceRepository.deleteAll();
        teamRepository.deleteAll();

        // Insert test data
        UserEntity user = new UserEntity();
        user.setUsername("user1");
        user.setEmail("user1@example.com");
        user.setPassword("password");
        userRepository.save(user);

        DriverEntity driver = new DriverEntity();
        driver.setName("driver1");
        driver.setTeam("team1");
        driver.setNationality("CH");
        driverRepository.save(driver);

        RaceEntity race = new RaceEntity();
        race.setName("race1");
        race.setLocation("location1");
        race.setDate(LocalDate.now());
        raceRepository.save(race);

        TeamEntity team = new TeamEntity();
        team.setName("team1");
        team.setCountry("country1");
        team.setChampionshipsWon(10);
        team.setCurrentPoints(158.5);
        teamRepository.save(team);
    }
}
