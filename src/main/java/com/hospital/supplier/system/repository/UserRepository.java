package com.hospital.supplier.system.repository;

import com.hospital.supplier.system.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Joe
 */

public interface UserRepository extends MongoRepository<User, String> {

    User findByUserIdAndPassword(String userId, String password); // for log in

    User findByUserId(String userId); //for sign up

    List<User> findAllUser();

}
