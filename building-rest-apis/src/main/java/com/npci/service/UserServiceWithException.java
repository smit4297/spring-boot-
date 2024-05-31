package com.npci.service;

import com.npci.exception.UserNotFoundException;
import com.npci.entity.UserBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class UserServiceWithException {

    private static List<UserBean> users = generateDummyUsers();

    public List<UserBean> fetchAllUsers() {
        return users;
    }

    private static List<UserBean> generateDummyUsers() {
        List<UserBean> users = new ArrayList<UserBean>();
        users.add(new UserBean(1L, "Ram", LocalDate.now().minusYears(25), "9867676", "ram@gmail.com", "abc@123",
                LocalDateTime.now(), null));
        users.add(new UserBean(2L, "Krishna", LocalDate.now().minusYears(45), "786786734", "krishna@gmail.com", "abc@123",
                LocalDateTime.now(), null));
        return users;
    }

    public UserBean getUserByID(Long userID) {
        if(userID < 0)
            throw new IllegalArgumentException("Invalid user ID");
        return users.stream()
                    .filter(user -> Objects.equals(user.getUserId(), userID))
                    .findFirst()
                    .orElseThrow(() -> new UserNotFoundException(userID));
    }

    public String deleteUserByID(Long userID) {
        if(getUserByID(userID) != null) {
            users.removeIf(user -> Objects.equals(user.getUserId(), userID));
            return "User deleted";
        }else{
            return "User not found";
        }
    }

    public UserBean createUser(UserBean user) {
        user.setUserId((long) (users.size() + 1));
        user.setUpdateDate(LocalDate.now().atStartOfDay());
        user.setCreateDate(LocalDate.now().atStartOfDay());
        users.add(user);
        return user;
    }

    public UserBean updateUser(UserBean existingUser, UserBean updatedUser) {
        if (updatedUser.getFullName() != null) {
            existingUser.setFullName(updatedUser.getFullName());
        }
        if (updatedUser.getDob() != null) {
            existingUser.setDob(updatedUser.getDob());
        }
        if (updatedUser.getMobile() != null) {
            existingUser.setMobile(updatedUser.getMobile());
        }
        if (updatedUser.getEmail() != null) {
            existingUser.setEmail(updatedUser.getEmail());
        }
        if (updatedUser.getPassword() != null) {
            existingUser.setPassword(updatedUser.getPassword());
        }
        existingUser.setUpdateDate(LocalDateTime.now());
        return existingUser;
    }
}
