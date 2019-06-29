package com.gfg.vivekkumar.SpringBootBackendServiceGeeks.controller;

import com.gfg.vivekkumar.SpringBootBackendServiceGeeks.model.User;
import com.gfg.vivekkumar.SpringBootBackendServiceGeeks.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDaoService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        userService.createUser(user);

        return user;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        userService.updateUser(user);
        return userService.getUserById(user.getId());
    }

    @DeleteMapping("/user/{id}")
    public User deleteUser(@PathVariable("id") Long id){
        User user = userService.getUserById(id);
        userService.deleteUser(id);
        return user;
    }



}