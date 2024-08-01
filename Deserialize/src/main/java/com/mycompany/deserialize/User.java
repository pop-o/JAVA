package com.mycompany.deserialize;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String password;

    public User(String name, String password) { // constructor should be public
        this.name = name;
        this.password = password;
    }

    public void print() {
        System.out.println(this.name + " " + this.password);
    }
}
