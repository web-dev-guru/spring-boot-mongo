package com.demo.mongo.model;

public class Address {
    private String city;
    private String province;
    private String street;
    public Address(){}
    public Address(String city,String province,String street){
        this.setCity(city);
        this.setProvince(province);
        this.setStreet(street);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
