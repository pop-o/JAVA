/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class Open {
    JFrame frame=new JFrame("New window opned");
    JLabel label=new JLabel("yoyoyoyoyoyo");
    Open(){
        
        label.setBounds(0,0,100,100);
    frame.setSize(500,500);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.add(label);
       frame.setLayout(null);
    }
}
