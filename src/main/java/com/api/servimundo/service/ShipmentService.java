package com.api.servimundo.service;

import java.util.List;
import java.util.Optional;

import com.api.servimundo.model.Shipment;

public interface ShipmentService {
    List<Shipment> findAll();
    Optional<Shipment> findById(Long id);
    Shipment save(Shipment shipment);
    Optional<Shipment> update(Shipment shipment, Long id);
    void remove(Long id);
}
