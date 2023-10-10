package com.api.servimundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.servimundo.model.ShippingPackage;
import com.api.servimundo.service.ShippingPackageService;


@RestController
@RequestMapping(path = "shipping_package")
public class ShippingPackageController {
    @Autowired
    private ShippingPackageService shippingPackageService;
    
    @GetMapping
    public List<ShippingPackage> findAll() {
        return shippingPackageService.findAll();
    }
}
