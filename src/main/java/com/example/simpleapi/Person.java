package com.example.simpleapi;

import java.util.UUID;

public class Person {

    private UUID id;
    private String name;
    private int age;
    private String gender;
    private String address;


    public Person() {
    }

    public Person(String name, int age, String gender, String address) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
