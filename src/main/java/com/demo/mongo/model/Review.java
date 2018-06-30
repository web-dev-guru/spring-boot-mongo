package com.demo.mongo.model;

import org.springframework.data.mongodb.core.mapping.Document;


public class Review {
    private String comment;
    private String author;
    public Review(){}
    public Review(String comment,String author){
        this.setComment(comment);
        this.setAuthor(author);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
