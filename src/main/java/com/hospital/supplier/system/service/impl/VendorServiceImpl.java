package com.hospital.supplier.system.service.impl;

import com.hospital.supplier.system.repository.ProductRepository;
import com.hospital.supplier.system.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.supplier.system.model.Vendor;
import com.hospital.supplier.system.service.VendorService;
import com.hospital.supplier.system.model.Product;

import java.util.List;

/**
 * @author Joe
 */

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Vendor> findAll() { return vendorRepository.findAll(); }

    @Override
    public Vendor createNewVendor(Vendor vendor) { return vendorRepository.save(vendor); }

    @Override
    public void deleteVendorById(String vendorId) {
         vendorRepository.deleteById(vendorId);
    }

    @Override
    public Vendor findByVendorId(String vendorId) {
        return vendorRepository.findByVendorId(vendorId);
    }

    @Override
    public Product purchaseProduct(String vendorId, String productId, int number) {
        Vendor vendor = vendorRepository.findByVendorId(vendorId);
        Product product = vendor.getProducts().stream().filter(product1 -> productId.equals(product1.getProductId()))
                .findAny().orElse(null);
        if (product != null) {
            for (int i = 0; i < number; i++) {
                productRepository.save(product);
            }
        }
        return product;
    }

}
