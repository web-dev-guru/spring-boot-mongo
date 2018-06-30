package com.demo.mongo.dao;

import com.demo.mongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String>{
    public User findOneByName(String name);
    User save(User user);
    List<User> findAll();
}
