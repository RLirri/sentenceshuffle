package com.concurrent.projectconcurrentprogramming.service;

import com.concurrent.projectconcurrentprogramming.dao.UserDAO;
import com.concurrent.projectconcurrentprogramming.modal.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Transactional
    @Override
    public List<User> get() {
        return userDAO.get();
    }
    @Transactional
    @Override
    public User get(int id) {
        return userDAO.get(id);
    }
    @Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);

    }
    @Transactional
    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
