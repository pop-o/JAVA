/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advjavalab;

/**
 *
 * @author HP
 */
public class Child extends Car {
    Child(String name,String model){
        super(name,model);
    }
    void display(){
        System.out.println(this.model+"is best");
    }
}
