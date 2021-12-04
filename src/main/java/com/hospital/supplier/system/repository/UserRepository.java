package com.hospital.supplier.system.repository;

import com.hospital.supplier.system.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Joe
 */

public interface UserRepository extends MongoRepository<User, String> {

    User findByUser_NameAndPassword(String user_name, String password); // for log in

    User findByUser_Name(String user_name); //for sign up

    List<User> findAllUser();

}
