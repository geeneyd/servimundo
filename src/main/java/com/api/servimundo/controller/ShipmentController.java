package com.api.servimundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.servimundo.model.Shipment;
import com.api.servimundo.service.ShipmentService;


@RestController
@RequestMapping(path = "shipment")
public class ShipmentController {
    @Autowired
    private ShipmentService shipmentService;
    
    @GetMapping
    public List<Shipment> findAll() {
        return shipmentService.findAll();
    }

    @PostMapping
    public ResponseEntity<Shipment> create(@RequestBody Shipment shipment) {
        return ResponseEntity.ok(shipmentService.save(shipment));
    }
}
