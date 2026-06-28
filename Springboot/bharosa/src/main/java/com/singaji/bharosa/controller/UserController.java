package com.singaji.bharosa.controller;

import com.singaji.bharosa.entity.User;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singaji.bharosa.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User Save(@RequestBody User user) {
        return service.save(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    // @GetMapping("/{id}")
    // public User getById(@PathVariable Long id) {
    // return service.getById(id);
    // }
    @GetMapping
    public Page<User> getAll(@RequestParam int page, @RequestParam int size) {
        return service.getAll(page, size);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return service.update(id, user);
    }

    @PatchMapping("/{id}")
    public User updatUser(@PathVariable Long id, @RequestBody Map<String, String> body) {
        return service.updateName(id, body.get("name"));
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return service.getById(id);
    }

}
