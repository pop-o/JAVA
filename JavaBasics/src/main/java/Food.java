/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Food {
    String name;
    Food(String name){
        this.name=name;
    }
    
    static void print(){
        System.out.println("Hello this is static");
    }
    
    void print(String name){
        System.out.println(name);
    }
}
