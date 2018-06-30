package com.demo.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userinfo")
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    private String age;
    public User(){}
    public User(String id, String name, String age){
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
