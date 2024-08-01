/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;

import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class Frame extends JFrame{
    
    DragDrop dragDrop=new DragDrop();
    
    Frame(){
        this.add(dragDrop);
        this.setTitle("Drag and drop");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }

    
}
