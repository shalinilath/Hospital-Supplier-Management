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
    public User findUserById(String userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public User findUserByIdAndPassword(String userId, String password) {
        return userRepository.findByUserIdAndPassword(userId, password);
    }

    @Override
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

}
