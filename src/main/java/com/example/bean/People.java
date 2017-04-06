package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by yangyu on 2017/1/12.
 */
@Entity
public class People {

    @Id
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
