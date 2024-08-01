/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advjavalab;

/**
 *
 * @author HP
 */
public class Car extends Vehicle {
    String model;
    Car(String name,String model){
        super(name);//to call contructor of parent class
        this.model=model;
    }
    void display(){
        System.out.printf("Name is: %s\nModel is: %s",this.name,this.model);
    }
}
