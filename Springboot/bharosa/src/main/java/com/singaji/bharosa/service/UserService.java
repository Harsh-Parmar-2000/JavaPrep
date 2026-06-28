package com.singaji.bharosa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;

import com.singaji.bharosa.entity.User;
import com.singaji.bharosa.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);

    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Page<User> getAll(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public User update(Long id, User user) {
        user.setId(id);
        return repository.save(user);
    }

    public User updateName(Long id, String name) {
        User user = repository.findById(id).orElse(null);

        if (user != null) {
            user.setName(name);
            return repository.save(user);
        }
        return null;
    }

    public long count() {
        return repository.count();
    }
}
