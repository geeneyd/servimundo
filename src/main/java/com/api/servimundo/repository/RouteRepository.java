package com.api.servimundo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.servimundo.model.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {
}
