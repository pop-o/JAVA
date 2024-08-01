/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Car extends Vehicle{
    String model;
    int price;
    String color;
    
    
    Car(String name,int speed,String model,int price,String color){
        super(name,speed);
        this.model=model;
        this.price=price;
        this.color=color;
        
    }
    String printo(){
        return super.hell()+this.model+super.yoyo();
    }
    void drive(){
        System.out.println("Driving");
    }
    public String toString(){
        return model+" "+color+" "+price;
    }
    
    
}
