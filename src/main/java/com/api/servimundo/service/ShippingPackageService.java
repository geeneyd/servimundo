package com.api.servimundo.service;

import java.util.List;
import java.util.Optional;

import com.api.servimundo.model.ShippingPackage;

public interface ShippingPackageService {
    List<ShippingPackage> findAll();
    Optional<ShippingPackage> findById(Long id);
    ShippingPackage save(ShippingPackage shippingPackage);
    Optional<ShippingPackage> update(ShippingPackage shippingPackage, Long id);
    void remove(Long id);
}
