package com.hospital.supplier.system.service;

import com.hospital.supplier.system.model.User;

import java.util.List;

/**
 * @author Joe
 */

public interface UserService {
    List<User> findAllUser();

    User findUserById(String userId);

    User findUserByIdAndPassword(String userId, String password);

    User saveOrUpdateUser(User user);

}
