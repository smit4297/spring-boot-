package com.npci.service;

import com.npci.entity.UserBean;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Component
public class UserServiceV1 {

    private static List<UserBean> users = generateDummyUsers();

    public List<UserBean> fetchAllUsers() {
        return users;
    }

    private static List<UserBean> generateDummyUsers() {
        List<UserBean> users = new ArrayList<UserBean>();
        users.add(new UserBean(1L, "Ram", LocalDate.now().minusYears(25), "9867676", "ram@gmail.com", "abc@123",
                LocalDateTime.now(), null));
        users.add(new UserBean(1L, "Krishna", LocalDate.now().minusYears(45), "786786734", "krishna@gmail.com", "abc@123",
                LocalDateTime.now(), null));
        return users;
    }
}
