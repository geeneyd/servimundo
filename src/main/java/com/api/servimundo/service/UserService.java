package com.api.servimundo.service;

import java.util.List;
import java.util.Optional;

import com.api.servimundo.model.User;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
    User save(User user);
    Optional<User> update(User user, Long id);
    void remove(Long id);
}
