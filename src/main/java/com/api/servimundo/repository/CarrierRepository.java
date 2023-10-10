package com.api.servimundo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.servimundo.model.Carrier;

public interface CarrierRepository extends JpaRepository<Carrier, Long> {
    
}
