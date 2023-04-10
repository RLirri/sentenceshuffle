package com.concurrent.projectconcurrentprogramming.controller;

import com.concurrent.projectconcurrentprogramming.modal.User;
import com.concurrent.projectconcurrentprogramming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> get() {
        return userService.get();
    }

    @PostMapping("/user")
    public User save(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @GetMapping("/user/{id}")
    public User get(@PathVariable int id) {
        return userService.get(id);
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable int id) {

        userService.delete(id);

        return "User removed with id "+id;

    }

    @PutMapping("/user")
    public User update(@RequestBody User user) {
        userService.save(user);
        return user;
    }
}
