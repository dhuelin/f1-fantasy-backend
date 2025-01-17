package com.dhuelin.f1.fantasy.backend.services;

import com.dhuelin.f1.fantasy.backend.dtos.UserDTO;
import com.dhuelin.f1.fantasy.backend.persistence.entities.UserEntity;
import com.dhuelin.f1.fantasy.backend.persistence.repositories.UserRepository;
import com.dhuelin.f1.fantasy.backend.services.mappers.UserMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@WebMvcTest
class DataRetrieverServiceTest {

    private final UserRepository userRepository = mock(UserRepository.class);
    private final UserMapper userMapper = mock(UserMapper.class);

    @Autowired
    private DataRetrieverService dataRetrieverService;

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
