package com.singaji.bharosa.service;

import org.springframework.stereotype.Service;

import com.singaji.bharosa.entities.UserRequest;
import com.singaji.bharosa.entities.UserResponse;

@Service
public class UserService {

    public UserResponse createUser(UserRequest userRequest){
        return new UserResponse();
    }

    // CRUD - 
}
