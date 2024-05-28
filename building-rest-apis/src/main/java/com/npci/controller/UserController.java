package com.npci.controller;


import com.npci.entity.UserBean;
import com.npci.service.UserServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceV1 userService;

    @GetMapping(path="/users")
    public ResponseEntity<List<UserBean>> getAllUsers(){
        List<UserBean> users = userService.fetchAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);

    }
}
