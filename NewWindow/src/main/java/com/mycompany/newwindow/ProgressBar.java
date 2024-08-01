/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ProgressBar implements ActionListener {
    JFrame frame=new JFrame();
    JProgressBar bar=new JProgressBar(0,500);
    JButton atk=new JButton("Press to Attack");
    
    ProgressBar(){
        
        atk.setBounds(100,100,100,50);
        atk.setBackground(Color.BLACK);
        atk.setFocusable(false);
        atk.setForeground(Color.WHITE);
        atk.setFont(new Font("MV Boli",Font.BOLD,20));
        
        bar.setValue(500);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,40));
        bar.setBackground(Color.black);
        bar.setForeground(Color.red);
        frame.add(bar);
        atk.addActionListener(this);
        frame.add(atk);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    public void fill(){
        int counter=500;
        while(counter>=0){
            bar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }   
            counter-=10;
    }
        bar.setString("You have defeated the boss");
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int value=bar.getValue();
        if(value==0){
            bar.setString("You have defeated the bosss");
            bar.setSize(900, 100);
        }
        value-=30;
        if(e.getSource()==atk){
            bar.setValue(value);
        }
    }
}
