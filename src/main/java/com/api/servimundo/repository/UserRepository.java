package com.api.servimundo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.servimundo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
