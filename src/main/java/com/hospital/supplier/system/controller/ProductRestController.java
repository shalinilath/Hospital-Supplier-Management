package com.hospital.supplier.system.controller;
import com.hospital.supplier.system.dto.ProductDTO;
import com.hospital.supplier.system.model.Product;
import com.hospital.supplier.system.service.ProductService;
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
@RequestMapping("/inventory")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/")
    public List<ProductDTO> getAllProducts() {
        return ObjectMapperUtils.mapAll(productService.findAll(), ProductDTO.class);
    }

    @GetMapping(value = "/byProductId/{productId}")
    public ProductDTO getProductById(@PathVariable("productId") String productId) {
        return ObjectMapperUtils.map(productService.findByProductId(productId), ProductDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveProduct(@RequestBody ProductDTO productDTO) {
        productService.saveOrUpdateProduct(ObjectMapperUtils.map(productDTO, Product.class));
        return new ResponseEntity("Inventory added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable String productId) {
        productService.deleteProductById(productId);
        return new ResponseEntity("Inventory deleted successfully", HttpStatus.OK);
    }
}
