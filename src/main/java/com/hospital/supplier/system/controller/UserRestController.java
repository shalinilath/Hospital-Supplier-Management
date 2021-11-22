package com.hospital.supplier.system.controller;

import com.hospital.supplier.system.dto.UserDTO;
import com.hospital.supplier.system.model.User;
import com.hospital.supplier.system.service.UserService;
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
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public List<UserDTO> getAllUsers() {
        return ObjectMapperUtils.mapAll(userService.findAllUser(), UserDTO.class);
    }

    @GetMapping(value = "/byUserId/{userId}")
    public UserDTO getUserById(@PathVariable("userId") String userId) {
        return ObjectMapperUtils.map(userService.findUserById(userId), UserDTO.class);
    }

    @GetMapping(value = "/byUserIdAndPassword/{userId}/{password}")
    public UserDTO getUserByIdAndPassword(@PathVariable("userId") String userId, @PathVariable("password") String password) {
        return ObjectMapperUtils.map(userService.findUserByIdAndPassword(userId, password), UserDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveNewUser(@RequestBody UserDTO userDTO) {
        UserRestController controller = new UserRestController();
        if (controller.getUserById(userDTO.getId()) != null) {
            return new ResponseEntity("User already existed!", HttpStatus.OK);
        } else {
            userService.saveOrUpdateUser(ObjectMapperUtils.map(userDTO, User.class));
            return new ResponseEntity("User added successfully", HttpStatus.OK);
        }
    }

}
