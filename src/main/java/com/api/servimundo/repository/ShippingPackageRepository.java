package com.api.servimundo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.servimundo.model.ShippingPackage;

public interface ShippingPackageRepository extends JpaRepository<ShippingPackage, Long> {
}
