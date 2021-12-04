package com.hospital.supplier.system.repository;

import com.hospital.supplier.system.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Joe
 */

public interface UserRepository extends MongoRepository<User, String> {

    User findByUserNameAndPassword(String userName, String password); // for log in

    User findByUserName(String userName); //for sign up

    List<User> findAll();

}
