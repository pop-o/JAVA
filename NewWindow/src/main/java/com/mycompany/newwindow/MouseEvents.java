/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class MouseEvents extends JFrame implements MouseListener{
    
    JLabel label;
    
    MouseEvents(){
        label=new JLabel();
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);
        this.add(label);
        this.setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        System.out.println("Mouse CLick");
        label.setBackground(Color.BLACK);
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
        label.setBackground(Color.DARK_GRAY);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
        label.setBackground(Color.MAGENTA);
    }

    @Override
    public void mouseEntered(MouseEvent e) {      
        System.out.println("Mouse Entered");
        label.setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
        label.setBackground(Color.PINK);
    }
    
}
