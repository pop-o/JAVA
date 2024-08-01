/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Fridge extends Machine {
    static int numberOfItems;
    void store(Food food){
        System.out.println(food.name+" is stored");
        numberOfItems++;
    }
    
    @Override
    public void here(){
        System.out.println("Here i am abstract method"); 
    }
    
}
