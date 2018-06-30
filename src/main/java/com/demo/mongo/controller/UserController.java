package com.demo.mongo.controller;

import com.demo.mongo.dao.UserRepository;
import com.demo.mongo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/user/{name}")
    public User read(@PathVariable String name) {
        //User u = new User("1","wesley","29");
        System.out.println("name is "+name);
        User u1 = userRepository.findOneByName(name);
        System.out.println("hello "+u1.getName());
        return u1;
    }
    @GetMapping(value = "/users/add")
    public User save() {
        User u = new User("3","jon","33");
        User u1 = userRepository.save(u);
        return u1;
    }
}
