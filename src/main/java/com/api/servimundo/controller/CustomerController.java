package com.api.servimundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.servimundo.model.Customer;
import com.api.servimundo.service.CustomerService;

@RestController
@RequestMapping(path = "customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    
    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }
}
