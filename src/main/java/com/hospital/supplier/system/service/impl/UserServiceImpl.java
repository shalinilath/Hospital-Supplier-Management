package com.hospital.supplier.system.service.impl;

import com.hospital.supplier.system.repository.UserRepository;
import com.hospital.supplier.system.service.UserService;
import com.hospital.supplier.system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Joe
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAllUser();
    }

    @Override
    public User findByUser_Name(String user_name) {
        return userRepository.findByUser_Name(user_name);
    }

    @Override
    public User findByUser_NameAndPassword(String user_name, String password) {
        return userRepository.findByUser_NameAndPassword(user_name, password);
    }

    @Override
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

}
