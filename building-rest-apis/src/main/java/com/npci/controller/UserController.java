package com.npci.controller;


import com.npci.entity.UserBean;
import com.npci.pojo.HelloWorldBean;
import com.npci.service.UserServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@RestController
public class UserController {

    @Autowired
    private UserServiceV1 userService;

    @GetMapping(path="/users")
    public ResponseEntity<List<UserBean>> getAllUsers(){
        List<UserBean> users = userService.fetchAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);

    }

    @GetMapping(path="/users/{userID}")
    public ResponseEntity<Object> userFindByID(@PathVariable Long userID){
        UserBean user = userService.getUserByID(userID);
        if(user == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user not found");
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping(path="/users/{userID}")
    public ResponseEntity<Object> deleteUserById(@PathVariable Long userID){
        String response = userService.deleteUserByID(userID);
        if(Objects.equals(response, "User not found")){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user not found");
        }
        return new ResponseEntity<>("user deleted", HttpStatus.OK);
    }

    @PostMapping("/add-user")
    public ResponseEntity<UserBean> createUser(@RequestBody UserBean user) {
        UserBean createdUser = userService.createUser(user.getFullName(), user.getDob(), user.getMobile(), user.getEmail(), user.getPassword());
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
