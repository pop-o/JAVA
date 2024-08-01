/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Vehicle {
    String name;
    int speed;
    void drive(){
        System.out.println(this.name+"is driving");
    }
    
    Vehicle(String name,int speed){
        this.name=name;
        this.speed=speed;
    }
    
    public String hell(){
        return this.name+"\n"+this.speed+"\n";
    }
    
    public String yoyo(){
        return "Hello";}
    
   
}
