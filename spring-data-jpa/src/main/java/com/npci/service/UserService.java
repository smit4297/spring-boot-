package com.npci.service;

import com.npci.entities.User;
import com.npci.repositiory.UserSpringDataJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceContract {

    @Autowired
    private UserSpringDataJPARepository repository;

    @Override
    public List<User> fetchAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserByID(Long userID) {
        Optional<User> user = repository.findById(userID);
        return user.orElse(null);
    }

    @Override
    public User createUser(User user) {
        user.setCreateDate(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));
        user.setUpdateDate(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));
        return repository.save(user);
    }

    @Override
    public User deleteUser(User user) {
        repository.delete(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        user.setUpdateDate(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));
        return repository.save(user);
    }

    public void deleteUserByID(Long userID) {
        repository.deleteById(userID);
    }
}
