package com.api.servimundo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.servimundo.model.Shipment;


public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

}
