package com.api.servimundo.service;

import java.util.List;
import java.util.Optional;

import com.api.servimundo.model.Customer;

public interface CustomerService {
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    Customer save(Customer customer);
    Optional<Customer> update(Customer customer, Long id);
    void remove(Long id);
}
