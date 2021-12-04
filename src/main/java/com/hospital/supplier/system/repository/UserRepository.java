package com.hospital.supplier.system.repository;

import com.hospital.supplier.system.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Joe
 */

public interface UserRepository extends MongoRepository<User, String> {

    User findByUsernameAndPassword(String userName, String password); // for log in

    User findByUsername(String userName); //for sign up

    List<User> findAllUser();

}
