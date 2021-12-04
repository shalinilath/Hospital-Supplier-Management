package com.hospital.supplier.system.service;

import com.hospital.supplier.system.model.User;

import java.util.List;

/**
 * @author Joe
 */

public interface UserService {
    List<User> findAllUser();

    User findByUser_Name(String user_name);

    User findByUser_NameAndPassword(String user_name, String password);

    User saveOrUpdateUser(User user);

}
