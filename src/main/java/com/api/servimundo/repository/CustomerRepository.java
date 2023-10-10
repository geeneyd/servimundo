package com.api.servimundo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.servimundo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
