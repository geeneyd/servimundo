package com.api.servimundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.servimundo.model.Route;
import com.api.servimundo.service.RouteService;


@RestController
@RequestMapping(path = "route")
public class RouteController {
    @Autowired
    private RouteService routeService;
    
    @GetMapping
    public List<Route> findAll() {
        return routeService.findAll();
    }
}
