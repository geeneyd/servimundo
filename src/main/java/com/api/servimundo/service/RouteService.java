package com.api.servimundo.service;

import java.util.List;
import java.util.Optional;

import com.api.servimundo.model.Route;

public interface RouteService {
    List<Route> findAll();
    Optional<Route> findById(Long id);
    Route save(Route route);
    Optional<Route> update(Route route, Long id);
    void remove(Long id);
}
