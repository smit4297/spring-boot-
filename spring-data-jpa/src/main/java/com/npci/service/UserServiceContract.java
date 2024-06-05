package com.npci.service;

import com.npci.entities.User;

import java.util.List;

public interface UserServiceContract {

    List<User> fetchAllUsers();
    User getUserByID(Long userID);
    User createUser(User user);
    User deleteUser(User user);
    User updateUser(User user);
}
