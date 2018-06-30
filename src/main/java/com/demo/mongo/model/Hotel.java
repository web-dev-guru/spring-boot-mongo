package com.demo.mongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

public class Hotel {
    private String id;
    private Address address;
    private List<Review> reviews;
    public Hotel(){}
    public Hotel(String id,Address address, List<Review> reviews){
        this.setAddress(address);
        this.setReviews(reviews);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
