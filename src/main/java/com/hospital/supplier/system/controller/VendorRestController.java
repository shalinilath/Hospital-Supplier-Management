package com.hospital.supplier.system.controller;

import com.hospital.supplier.system.dto.VendorDTO;
import com.hospital.supplier.system.model.Vendor;
import com.hospital.supplier.system.service.VendorService;
import com.hospital.supplier.system.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Joe
 */
@RestController
@RequestMapping("/vendors")
public class VendorRestController {

    @Autowired
    private  VendorService vendorService;

    @GetMapping(value = "/")
    public List<VendorDTO> getAllVendors() {
        return ObjectMapperUtils.mapAll(vendorService.findAll(), VendorDTO.class);
    }

    @GetMapping(value = "/byVendorId/{vendorId}")
    public VendorDTO getVendorByVendorId(@PathVariable("vendorId") String vendorId) {
        return ObjectMapperUtils.map(vendorService.findByVendorId(vendorId), VendorDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateVendor(@RequestBody VendorDTO vendorDTO) {
        vendorService.createNewVendor(ObjectMapperUtils.map(vendorDTO,Vendor.class));
        return new ResponseEntity("Vendor added successfully!", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{vendorId}")
    public ResponseEntity<?> deleteVendor(@PathVariable String vendorId) {
        vendorService.deleteVendorById(vendorId);
        return new ResponseEntity("Vendor deleted successfully", HttpStatus.OK);
    }

}
