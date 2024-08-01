package com.mycompany.serialization;

import java.io.Serializable;


public class User implements Serializable{
    private String name;
    private String password;
    User(String name,String password){
        this.name=name;
        this.password = password;
       
    }
    public void print(){
        System.out.println(this.name+' '+this.password);
    }
}
