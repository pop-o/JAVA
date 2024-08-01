/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advjavalab;

/**
 *
 * @author HP
 */
public class Dispatch {
    public static void main(String[] args){
        A a;
        System.out.println("Dynamic method dispatch");
        a=new B();
        a.display();
    }
}
