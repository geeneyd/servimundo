package com.api.servimundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.servimundo.model.Carrier;
import com.api.servimundo.service.CarrierService;

@RestController
@RequestMapping(path = "carrier")
public class CarrierController {
    @Autowired
    private CarrierService carrierService;
    
    @GetMapping
    public List<Carrier> findAll() {
        return carrierService.findAll();
    }
}
