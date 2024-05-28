package com.npci.controller;


import com.npci.entity.UserBean;
import com.npci.pojo.HelloWorldBean;
import com.npci.service.UserServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
