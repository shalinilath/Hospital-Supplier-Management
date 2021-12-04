package com.hospital.supplier.system.repository;


import com.hospital.supplier.system.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Joe
 */

public interface ProductRepository extends MongoRepository<Product, String> {
    Product findProductById(String productId);

    List<Product> findAll();

}
