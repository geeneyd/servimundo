package com.api.servimundo.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.servimundo.model.ShippingPackage;
import com.api.servimundo.repository.ShippingPackageRepository;
import com.api.servimundo.service.ShippingPackageService;

@Service
public class ShippingPackageServiceImpl implements ShippingPackageService {

    @Autowired
    private ShippingPackageRepository shippingPackageRepository;

    @Override
    public List<ShippingPackage> findAll() {
        return shippingPackageRepository.findAll();
    }

    @Override
    public Optional<ShippingPackage> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public ShippingPackage save(ShippingPackage shippingPackage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<ShippingPackage> update(ShippingPackage shippingPackage, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void remove(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    
}
