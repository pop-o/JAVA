/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class Window implements ActionListener{
    
    JFrame frame=new JFrame();
    JButton btn=new JButton("CLick mew");
    Window(){
        
        btn.setBounds(100,100,100,50);
        btn.setFocusable(false);
        btn.addActionListener(this);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(btn);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            frame.dispose();
            Open open=new Open();
        }
    }
}
