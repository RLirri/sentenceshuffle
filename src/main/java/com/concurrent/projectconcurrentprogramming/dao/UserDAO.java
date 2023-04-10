package com.concurrent.projectconcurrentprogramming.dao;

import com.concurrent.projectconcurrentprogramming.modal.User;

import java.util.List;

public interface UserDAO {
    List<User> get();
    User get(int id);
    void save(User user);
    void delete(int id);
}
