package com.neo.karmapath.service;

import com.neo.karmapath.dto.UserDTO;
import com.neo.karmapath.dto.UserRequestDTO;

public interface UserService {
    UserDTO createUser(UserRequestDTO user);
    UserDTO getUserById(Long id);
}
