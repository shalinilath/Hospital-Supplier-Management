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

    @GetMapping(value = "/byUserId/{userName}")
    public UserDTO getUserByName(@PathVariable("userName") String userName) {
        return ObjectMapperUtils.map(userService.findByUsername(userName), UserDTO.class);
    }

    @GetMapping(value = "/byUserIdAndPassword/{userName}/{password}")
    public UserDTO getUserByIdAndPassword(@PathVariable("userName") String userName, @PathVariable("password") String password) {
        return ObjectMapperUtils.map(userService.findByUsernameAndPassword(userName, password), UserDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveNewUser(@RequestBody UserDTO userDTO) {
        UserRestController controller = new UserRestController();
        if (controller.getUserByName(userDTO.getUserName()) != null) {
            return new ResponseEntity("User already existed!", HttpStatus.OK);
        } else {
            userService.saveOrUpdateUser(ObjectMapperUtils.map(userDTO, User.class));
            return new ResponseEntity("User added successfully", HttpStatus.OK);
        }
    }

}
