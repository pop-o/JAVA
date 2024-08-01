/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class KeyEvents extends JFrame implements KeyListener{

    JLabel label;
    JLabel label2;
    
    KeyEvents(){
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        label=new JLabel();
        label.setBounds(0,0,50,50);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label2=new JLabel();
        label2.setBounds(0,100,50,50);
        label2.setBackground(Color.blue);
        label2.setOpaque(true);
        this.add(label);
        this.add(label2);
        this.addKeyListener(this);
        this.setVisible(true);
    }
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        
//        switch(e.getKeyChar()){
//            case 'a': label.setLocation(label.getX()-5,label.getY());
//                      break;
//            case 'w': label.setLocation(label.getX(),label.getY()-5);
//                      break;
//            case 's': label.setLocation(label.getX(),label.getY()+5);
//                      break;
//            case 'd': label.setLocation(label.getX()+5,label.getY());
//                      break;
//            case 'j': label2.setLocation(label2.getX()-5,label2.getY());
//                      break;
//            case 'i': label2.setLocation(label2.getX(),label2.getY()-5);
//                      break;
//            case 'k': label2.setLocation(label2.getX(),label2.getY()+5);
//                      break;
//            case 'l': label2.setLocation(label2.getX()+5,label2.getY());
//                      break;
//        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX()-5,label.getY());
                      break;
            case 38: label.setLocation(label.getX(),label.getY()+5);
                      break;
            case 40: label.setLocation(label.getX(),label.getY()-5);
                      break;
            case 39: label.setLocation(label.getX()+5,label.getY());
                      break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("\nKey released: ");
//        System.out.println("key character: "+e.getKeyChar());
//        System.out.println("key code: "+e.getKeyCode());
switch(e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-5,label.getY());
                      break;
            case 'w': label.setLocation(label.getX(),label.getY()-5);
                      break;
            case 's': label.setLocation(label.getX(),label.getY()+5);
                      break;
            case 'd': label.setLocation(label.getX()+5,label.getY());
                      break;
            case 'j': label2.setLocation(label2.getX()-5,label2.getY());
                      break;
            case 'i': label2.setLocation(label2.getX(),label2.getY()-5);
                      break;
            case 'k': label2.setLocation(label2.getX(),label2.getY()+5);
                      break;
            case 'l': label2.setLocation(label2.getX()+5,label2.getY());
                      break;
        }
    }
    
}
