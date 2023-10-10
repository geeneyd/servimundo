package com.api.servimundo.service;

import java.util.List;
import java.util.Optional;

import com.api.servimundo.model.Carrier;

public interface CarrierService {
    List<Carrier> findAll();
    Optional<Carrier> findById(Long id);
    Carrier save(Carrier carrier);
    Optional<Carrier> update(Carrier carrier, Long id);
    void remove(Long id);
}
