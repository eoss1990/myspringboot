package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by yangyu on 2017/1/18.
 */
@Entity
public class Cat {
    @Id
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
