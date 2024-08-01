/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advjavalab;

/**
 *
 * @author HP
 */
public class MultiA implements Bi{
    
    
    @Override
    public void display(){
        System.out.println("Name is: "+this.name);
    }
    public static void main(String[] args) {
        MultiA inheritI=new MultiA();
        System.out.println("Inheritance using interfaces (Extending interfaces):");
      inheritI.display();

    }
}

