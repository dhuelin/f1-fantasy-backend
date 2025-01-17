package com.dhuelin.f1.fantasy.backend.services;

import com.dhuelin.f1.fantasy.backend.dtos.UserDTO;
import com.dhuelin.f1.fantasy.backend.persistence.entities.UserEntity;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.UserRepository;
import com.dhuelin.f1.fantasy.backend.services.mappers.UserMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class DataRetrieverServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserMapper userMapper;

    @InjectMocks
    private DataRetrieverService dataRetrieverService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllUsers_ShouldReturnMappedDTOs() {
        // Arrange
        UserEntity userEntity = new UserEntity(1L, "user1", "user1@example.com", "password", 0);
        UserDTO userDTO = new UserDTO("user1", "user1@example.com", 0);

        when(userRepository.findAll()).thenReturn(List.of(userEntity));
        when(userMapper.toDTO(userEntity)).thenReturn(userDTO);

        // Act
        List<UserDTO> users = dataRetrieverService.getAllUsers();

        // Assert
        assertThat(users).containsExactly(userDTO);
        verify(userRepository, times(1)).findAll();
        verify(userMapper, times(1)).toDTO(userEntity);
    }
}
