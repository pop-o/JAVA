/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;

/**
 *
 * @author HP
 */
public class GenericClass {
    public static void main(String[] args) {
        GenClass<Integer,Double> myInt=new GenClass<>(1,23.2);
//        GenClass<Double> myDouble=new GenClass<>(12.2);
//        GenClass<Character> myChar=new GenClass<>('a');
//        GenClass<String> myString=new GenClass<>("Hello");
        
        System.out.println(myInt.getSValue());
        System.out.println(myInt.getFValue());
//        System.out.println(myDouble.getValue());
//        System.out.println(myChar.getValue());
//        System.out.println(myString.getValue());
        
    }
}
