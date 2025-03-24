package com.neo.karmapath.controller;

import com.neo.karmapath.dto.UserDTO;
import com.neo.karmapath.dto.UserRequestDTO;
import com.neo.karmapath.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserRequestDTO userRequest) {
        return ResponseEntity.ok(userServiceImpl.createUser(userRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(userServiceImpl.getUserById(id));
    }
}
