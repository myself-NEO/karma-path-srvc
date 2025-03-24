package com.neo.karmapath.service.impl;

import com.neo.karmapath.dto.UserDTO;
import com.neo.karmapath.dto.UserRequestDTO;
import com.neo.karmapath.mapper.AppMapper;
import com.neo.karmapath.model.User;
import com.neo.karmapath.repository.UserRepository;
import com.neo.karmapath.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AppMapper appMapper;

    @Override
    public UserDTO createUser(UserRequestDTO request) {
        User user = appMapper.toUserEntity(request);
        return appMapper.toUserDTO(userRepository.save(user));
    }

    @Override
    public UserDTO getUserById(Long id) {
        return userRepository.findById(id)
                .map(appMapper::toUserDTO)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
