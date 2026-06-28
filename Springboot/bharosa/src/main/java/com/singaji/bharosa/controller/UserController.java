package com.singaji.bharosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.singaji.bharosa.entities.UserRequest;
import com.singaji.bharosa.entities.UserResponse;
import com.singaji.bharosa.service.UserService;

import jakarta.servlet.http.HttpServletRequest;



@RestController // controller vs restcontroller - xml / html vs json / xml
public class UserController {
    // create user, read user, update user, delete user

    // three type of injecting a dependency
    @Autowired                  // reflection api, field level injection
    UserService userService;

    // Constructor Injection

    // Setter Injection

   
    @PostMapping("/create/user/{userId}") // @GetMapping, @PutMapping, @DeleteMapping, @PatchMapping, @RequestMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest, HttpServletRequest request, @PathVariable String userId, @RequestParam String language) { // @PathVariable, @RequestParam, @RequestHeader, @CookieValue, @RequestBody
        return userService.createUser(userRequest);
    }

}
// 8080
// localhost:8080/create/user/{userId}

// IoC, DI, 
//  UserService userService = new UserService(); // 200 object
// Springboot - ApplicationContext, Bean, 
    