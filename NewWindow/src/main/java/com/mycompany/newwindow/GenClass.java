/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;

/**
 *
 * @author HP
 */
public class GenClass <T extends Number,V>  {
    T x;
    V y;
    GenClass(T x,V y){
        this.x=x;
        this.y=y;
    }
    
    public T getFValue(){
        return x;
    }
    public V getSValue(){
        return y;
    }
    
}
