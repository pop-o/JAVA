/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;

/**
 *
 * @author HP
 */
public class Generics {
    public static void main(String[] args) {
        Integer[] intarr={1,2,3,4,5};
        Character[] chararr={'a','b','d'};
        String[] stringarr={"as","asdasd","4td"};
        Double[] doublearr={2.4,342.4,23.4};
        displayArray(intarr);
        displayArray(chararr);
        displayArray(stringarr);
        displayArray(doublearr);
        System.out.println(getFirst(intarr));
        System.out.println(getFirst(chararr));
        System.out.println(getFirst(stringarr));
        System.out.println(getFirst(doublearr));
        
    }
    public static <T> void displayArray(T[] array){
            for(T x:array){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    
    public static <T> T getFirst(T[] array){
        return array[0];
    }
}
