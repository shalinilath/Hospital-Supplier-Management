package com.hospital.supplier.system.service;
import com.hospital.supplier.system.model.Product;
import com.hospital.supplier.system.model.Vendor;

import java.util.List;

public interface VendorService {

    List<Vendor> findAll();

    Vendor findByVendorId(String vendorId);

    Product purchaseProduct(String vendorId, String productId, int number);

    Vendor createNewVendor(Vendor vendor);

    void deleteVendorById(String vendorId);


}
