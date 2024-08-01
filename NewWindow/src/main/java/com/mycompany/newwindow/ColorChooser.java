/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newwindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author HP
 */
public class ColorChooser extends JFrame implements ActionListener {
    JButton btn;
    JLabel label;
    
    
    ColorChooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        btn=new JButton("Choose a color");
        btn.setFocusable(false);
        label=new JLabel("Hello there");
        
        label.setFont(new Font("MV Boli",Font.BOLD,40));
        label.setBackground(Color.gray);
        label.setOpaque(true);
        btn.addActionListener(this);
        this.add(btn);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            JColorChooser colorChooser=new JColorChooser();
            Color color=JColorChooser.showDialog(null, "Choose a color bro", Color.yellow);
            
            label.setBackground(color);
        }
    }
    
}
